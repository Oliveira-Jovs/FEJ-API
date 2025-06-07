package com.tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarefas.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {}
