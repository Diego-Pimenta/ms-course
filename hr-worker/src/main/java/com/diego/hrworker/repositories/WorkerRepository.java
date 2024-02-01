package com.diego.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
