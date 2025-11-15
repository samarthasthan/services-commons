package postgres

import (
	"context"
	"fmt"
	"time"

	"github.com/jackc/pgx/v5/tracelog"
	"github.com/sirupsen/logrus"
)

type PgxLogger struct{}

var log = logrus.New()

func init() {
	log.SetFormatter(&logrus.TextFormatter{
		ForceColors:            true,
		FullTimestamp:          true,
		TimestampFormat:        "15:04:05",
		PadLevelText:           true,
		DisableLevelTruncation: true,
	})
}

// color helpers
func green(s string) string  { return "\033[32m" + s + "\033[0m" }
func yellow(s string) string { return "\033[33m" + s + "\033[0m" }
func red(s string) string    { return "\033[31m" + s + "\033[0m" }

func (l *PgxLogger) Log(ctx context.Context, level tracelog.LogLevel, msg string, data map[string]any) {
	sql, ok := data["sql"].(string)
	if !ok || sql == "" {
		return
	}

	args := data["args"]
	duration, _ := data["time"].(time.Duration)

	var durColor string
	switch {
	case duration > 500*time.Millisecond:
		durColor = red(fmt.Sprintf("[%v]", duration))
	case duration > 100*time.Millisecond:
		durColor = yellow(fmt.Sprintf("[%v]", duration))
	default:
		durColor = green(fmt.Sprintf("[%v]", duration))
	}

	// No leading newline → ARGS stays close
	log.Infof("%s %sARGS: %v", durColor, sql, args)

	// Add ONE clean blank line after block
	fmt.Println()
}
