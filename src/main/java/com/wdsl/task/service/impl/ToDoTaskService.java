package com.wdsl.task.service.impl;

import com.wdsl.task.model.ToDoTask;
import com.wdsl.task.repository.ToDoTaskRepository;
import com.wdsl.task.service.IToDoTaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToDoTaskService implements IToDoTaskService {
    private final ToDoTaskRepository toDoTaskRepository;

    @Override
    public ToDoTask addTask(ToDoTask task) {
        return toDoTaskRepository.save(task);
    }

    @Override
    public void removeTask(int id) {
        toDoTaskRepository.deleteById(id);
    }

    @Override
    public void markTaskAsCompleted(int id) {
        Optional<ToDoTask> taskOpt = toDoTaskRepository.findById(id);
        if (taskOpt.isPresent()) {
            ToDoTask task = taskOpt.get();
            task.setCompleted(true);
            toDoTaskRepository.save(task);
        }
    }

    @Override
    public List<ToDoTask> getTasks() {
        return toDoTaskRepository.findAll();
    }

    @Override
    public ToDoTask getTaskById(int id) {
        return toDoTaskRepository.findById(id).orElse(null);
    }
}
