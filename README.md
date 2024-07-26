# Gerenciador de Tarefas - Diagrama de Classe

Este projeto é um simples gerenciador de tarefas, permitindo adicionar, remover e marcar tarefas como concluídas. Abaixo está o diagrama de classe que ilustra a estrutura do sistema.

Para acessar a documentação da API e testar os endpoints, visite o [Swagger UI](http://localhost:8080/swagger-ui.html).

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
