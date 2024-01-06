package com.teamsparta.todolist.domain.Todo.controller

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id
import com.teamsparta.todolist.domain.Todo.dto.CreateTodoRequest
import com.teamsparta.todolist.domain.Todo.dto.TodoResponse
import com.teamsparta.todolist.domain.Todo.dto.UpdateTodoRequest
import com.teamsparta.todolist.domain.Todo.service.TodoService
import org.apache.coyote.Response
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class TodoController(
    private val todoService: TodoService) {

    @GetMapping("/{todoId}")
    fun getTodoById(
        @PathVariable todoId: Long,
    ): ResponseEntity<TodoResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getTodoById(todoId))
    }

    @GetMapping
    fun getTodoList(): ResponseEntity<List<TodoResponse>> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.getTodoList())
    }

    @PostMapping
    fun createTodo(
        @RequestBody createTodoRequest: CreateTodoRequest,
    ): ResponseEntity<TodoResponse> {
        return ResponseEntity
            .status(HttpStatus.CREATED)
            .body(todoService.createTodo(createTodoRequest))
    }

    @PutMapping("/{todoId}")
    fun updateTodo(
        @PathVariable todoId: Long,
        @RequestBody updateTodoRequest: UpdateTodoRequest,
    ): ResponseEntity<TodoResponse> {
        return ResponseEntity
            .status(HttpStatus.OK)
            .body(todoService.updateTodo(updateTodoRequest))
    }

    @DeleteMapping("/{todoId}")
    fun deleteTodo(
        @PathVariable todoId: Long,
    ): ResponseEntity<Unit> {
        return ResponseEntity
            .status(HttpStatus.NO_CONTENT)
            .build()
    }
}