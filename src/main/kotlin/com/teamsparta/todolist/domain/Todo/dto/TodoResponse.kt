package com.teamsparta.todolist.domain.Todo.dto

data class TodoResponse(
    val id: Long,
    val title: String,
    val description: String,
    val date: String,
    val authorName: String
)
