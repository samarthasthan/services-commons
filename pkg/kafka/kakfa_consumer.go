package kafka

import (
	"fmt"

	"github.com/confluentinc/confluent-kafka-go/v2/kafka"
)

type KafkaConsumer struct {
	*kafka.Consumer
}

func NewKafkaConsumer(host string, port string, group string) *KafkaConsumer {
	c, err := kafka.NewConsumer(&kafka.ConfigMap{
		"bootstrap.servers": fmt.Sprintf("%s:%s", host, port),
		"group.id":          group,
		"auto.offset.reset": "earliest",
	})

	if err != nil {
		panic(err)
	}
	return &KafkaConsumer{Consumer: c}
}

func (kc *KafkaConsumer) Subscribe(topics []string) error {
	return kc.Consumer.SubscribeTopics(topics, nil)
}
