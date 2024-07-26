package com.wdsl.task.service;

import com.wdsl.task.model.ToDoTask;

import java.util.List;

public interface IToDoTaskService {
    ToDoTask addTask(ToDoTask task);
    void removeTask(int id);
    void markTaskAsCompleted(int id);
    List<ToDoTask> getTasks();
    ToDoTask getTaskById(int id);
}
