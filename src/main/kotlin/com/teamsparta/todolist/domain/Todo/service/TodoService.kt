package com.teamsparta.todolist.domain.Todo.service

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id
import com.teamsparta.todolist.domain.Todo.dto.CreateTodoRequest
import com.teamsparta.todolist.domain.Todo.dto.TodoResponse
import com.teamsparta.todolist.domain.Todo.dto.UpdateTodoRequest

interface TodoService {
    fun getTodoById(todoId: Long): TodoResponse

    fun getTodoList(): List<TodoResponse>

    fun createTodo(request: CreateTodoRequest): TodoResponse

    fun updateTodo(request: UpdateTodoRequest): TodoResponse

    fun deleteTodo(todoId: Long)
}