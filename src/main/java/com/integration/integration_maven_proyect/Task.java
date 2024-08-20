package com.integration.integration_maven_proyect;

public class Task {
	private String title;
    private boolean completed;

    public Task(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return title + (completed ? " (Completada)" : " (Pendiente)");
    }
}
