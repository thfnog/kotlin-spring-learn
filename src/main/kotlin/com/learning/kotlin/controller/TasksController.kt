package com.learning.kotlin.controller

import com.learning.kotlin.controller.json.TaskRequest
import com.learning.kotlin.controller.json.TaskResponse
import com.learning.kotlin.service.ITasksService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/tasks")
class TasksController(val service: ITasksService) {

    @PostMapping(
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun create(@RequestBody taskRequest: TaskRequest) {
        service.create(taskRequest.toDto())
    }

    @PatchMapping(
        "/{id}",
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun update(@PathVariable id: Long, @RequestBody taskRequest: TaskRequest) {
        service.update(id, taskRequest.toDto())
    }

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getAll(): List<TaskResponse> {
        return service.getTasks()?.map { it.toResponse() }.orEmpty()
    }

    @GetMapping(
        "/{id}",
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun getTask(@PathVariable id: Long): TaskResponse? {
        return service.getTask(id)?.toResponse()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        service.delete(id)
    }
}