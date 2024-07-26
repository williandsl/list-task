

```mermaid
classDiagram

class Task {
    - id: int
    - description: String
    - isCompleted: boolean
    + getId(): int
    + getDescription(): String
    + isCompleted(): boolean
    + setDescription(description: String): void
    + setCompleted(isCompleted: boolean): void
}

class TaskManager {
    - tasks: List<Task>
    + addTask(description: String): void
    + removeTask(id: int): void
    + markTaskAsCompleted(id: int): void
    + getTasks(): List<Task>
    + getTaskById(id: int): Task
}

TaskManager --* Task
