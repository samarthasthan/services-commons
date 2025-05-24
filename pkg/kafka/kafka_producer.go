package kafka

import (
	"context"
	"encoding/json"
	"fmt"
	"log"

	"github.com/confluentinc/confluent-kafka-go/v2/kafka"
)

type KafkaProducer struct {
	producer *kafka.Producer
}

func NewKafkaProducer(host string, port string) *KafkaProducer {
	p, err := kafka.NewProducer(&kafka.ConfigMap{"bootstrap.servers": fmt.Sprintf("%s:%s", host, port)})
	if err != nil {
		panic(err)
	}
	return &KafkaProducer{
		producer: p,
	}

}

func (kp *KafkaProducer) ProduceMsg(ctx context.Context, topic string, msg any) error {
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
