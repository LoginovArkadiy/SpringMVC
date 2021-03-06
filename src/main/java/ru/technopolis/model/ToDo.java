package ru.technopolis.model;

public class ToDo {
    private final long id;
    private String description;
    private boolean mark;

    public ToDo(long id, String description) {
        this.id = id;
        this.description = description;
        mark = false;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }
}
