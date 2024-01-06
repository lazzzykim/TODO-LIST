package com.teamsparta.todolist.domain.Todo.dto

data class CreateTodoRequest(
    val title: String,
    val description: String,
    val date: String,
    val authorName: String
)
