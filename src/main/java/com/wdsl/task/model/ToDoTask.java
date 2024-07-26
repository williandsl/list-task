package com.wdsl.task.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class ToDoTask {
    private int id;
    private String description;
    private boolean isCompleted = false;
}
