package com.Kafka_microservices.productservices.repository;

import com.Kafka_microservices.productservices.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
