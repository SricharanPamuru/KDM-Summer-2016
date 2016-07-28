package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Athletics", "Sport"));
		todos.add(new Todo("Cricket", "Sport"));
		todos.add(new Todo("Football", "Sport"));
		todos.add(new Todo("Rugby", "Sport"));
		todos.add(new Todo("Tennis", "Sport"));
	}

	public static List<Todo> retrieveTodos() {
		return todos;
	}

	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}

}
