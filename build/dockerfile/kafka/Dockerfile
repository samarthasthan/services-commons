FROM bitnami/kafka:3.6.1

WORKDIR /opt/bitnami/kafka/bin

USER root

# Only install netcat if needed for wait-for.sh (commonly used for health/wait checks)
RUN apt-get update && \
    apt-get install -y netcat-traditional && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Kafka configuration
ENV KAFKA_ENABLE_KRAFT=yes
ENV ALLOW_PLAINTEXT_LISTENER=yes

ENV KAFKA_CFG_NODE_ID=1
ENV KAFKA_CFG_PROCESS_ROLES=broker,controller

ENV KAFKA_CFG_CONTROLLER_LISTENER_NAMES=CONTROLLER
ENV KAFKA_CFG_INTER_BROKER_LISTENER_NAME=CLIENT
ENV KAFKA_CFG_LISTENERS=CLIENT://:29092,EXTERNAL://:9092,CONTROLLER://:9093
ENV KAFKA_CFG_LISTENER_SECURITY_PROTOCOL_MAP=CONTROLLER:PLAINTEXT,CLIENT:PLAINTEXT,EXTERNAL:PLAINTEXT
ENV KAFKA_CFG_ADVERTISED_LISTENERS=CLIENT://kafka:29092,EXTERNAL://localhost:9092
ENV KAFKA_CFG_CONTROLLER_QUORUM_VOTERS=1@127.0.0.1:9093

COPY --chmod=755 kafka_setup.sh ./
COPY --chmod=755 wait-for.sh ./
