package com.wdsl.task.repository;

import com.wdsl.task.model.ToDoTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoTaskRepository extends JpaRepository<ToDoTask, Integer> {
}
