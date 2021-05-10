package com.michelspirlandeli.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michelspirlandeli.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
