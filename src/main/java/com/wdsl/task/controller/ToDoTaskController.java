package com.wdsl.task.controller;

import com.wdsl.task.model.ToDoTask;
import com.wdsl.task.service.impl.ToDoTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ToDoTaskController {

    private final ToDoTaskService toDoTaskService;

    @PostMapping
    public ResponseEntity<ToDoTask> addTask(@RequestBody ToDoTask task) {
        ToDoTask createdTask = toDoTaskService.addTask(task);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removeTask(@PathVariable int id) {
        toDoTaskService.removeTask(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/{id}/complete")
    public ResponseEntity<Void> markTaskAsCompleted(@PathVariable int id) {
        toDoTaskService.markTaskAsCompleted(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<ToDoTask>> getTasks() {
        List<ToDoTask> tasks = toDoTaskService.getTasks();
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ToDoTask> getTaskById(@PathVariable int id) {
        ToDoTask task = toDoTaskService.getTaskById(id);
        return task != null ? new ResponseEntity<>(task, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
