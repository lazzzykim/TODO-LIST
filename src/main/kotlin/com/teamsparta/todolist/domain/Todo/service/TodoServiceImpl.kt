package com.teamsparta.todolist.domain.Todo.service

import com.teamsparta.todolist.domain.Todo.dto.CreateTodoRequest
import com.teamsparta.todolist.domain.Todo.dto.TodoResponse
import com.teamsparta.todolist.domain.Todo.dto.UpdateTodoRequest
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl: TodoService {
    override fun getTodoById(todoId: Long): TodoResponse {
        // TODO: DB에서 해당하는 todoID를 조회 후 TodoResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun getTodoList(): List<TodoResponse> {
        // TODO: DB에서 todo 전체를 불러와 TodoResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    @Transactional
    override fun createTodo(request: CreateTodoRequest): TodoResponse {
        // TODO: 해당id가 없으면 throw ModelNotFoundException
        // TODO: request를 Todo로 변환 후 저장
        TODO("Not yet implemented")
    }

    override fun updateTodo(request: UpdateTodoRequest): TodoResponse {
        // TODO: 해당id가 없으면 throw ModelNotFoundException
        // TODO: DB에서 해당하는 todoId를 조회해 request로 업데이트 후 todoresponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun deleteTodo(todoId: Long) {
        // TODO: DB의 해당todoID를 삭제
        // TODO: 해당id가 없으면 throw ModelNotFoundException
        TODO("Not yet implemented")
    }
}