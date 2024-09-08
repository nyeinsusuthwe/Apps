package it.jgiem.apps.todoList;

public interface TodoListener {
    void onEditTodo(Todo todo);
    void onDeleteTodo(int id);
}
