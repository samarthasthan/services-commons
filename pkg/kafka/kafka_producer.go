package kafka

import (
	"context"
	"encoding/json"
	"fmt"
	"log"

	"github.com/confluentinc/confluent-kafka-go/v2/kafka"
)

type Producer struct {
	producer *kafka.Producer
}

func NewKafkaProducer(host string, port string) *Producer {
	p, err := kafka.NewProducer(&kafka.ConfigMap{"bootstrap.servers": fmt.Sprintf("%s:%s", host, port),
		"linger.ms":        0,
		"compression.type": "none",
		"acks":             1,
	})
	if err != nil {
		panic(err)
	}
	return &Producer{
		producer: p,
	}

}

func (kp *Producer) ProduceMsg(ctx context.Context, topic string, msg any) error {
	data, err := json.Marshal(msg)
	if err != nil {
		log.Fatalln(err)
	}
	err = kp.producer.Produce(&kafka.Message{
		TopicPartition: kafka.TopicPartition{Topic: &topic, Partition: kafka.PartitionAny},
		Value:          data,
	}, nil)

	if err != nil {
		log.Fatalln(err)
	}
	return err
}

// close
func (kp *Producer) Close() {
	kp.producer.Close()
}

// flush
func (kp *Producer) Flush(timeoutMs int) int {
	return kp.producer.Flush(timeoutMs)
}
