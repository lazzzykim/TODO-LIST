package com.teamsparta.todolist.domain.TodoCard.dto

import org.springframework.context.annotation.Description

data class TodoCardResponse(
    val id: Long,
    val title: String,
    val description: String,
    val date: String,
    val authorName: String
)
