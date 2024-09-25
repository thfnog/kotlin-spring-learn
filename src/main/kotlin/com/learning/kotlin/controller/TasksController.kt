package com.learning.kotlin.controller

import com.learning.kotlin.service.TasksService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/tasks")
class TasksController(
    val service: TasksService
) {

    @PostMapping(
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun create(@RequestBody taskDto: TaskDto) {
        service.create(taskDto)
    }

    @PatchMapping(
        "/{id}",
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun update(@RequestParam id: Long, @RequestBody taskDto: TaskDto) {
        service.update(id, taskDto)
    }

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getAll(): MutableList<TaskDto>? {
        return service.getTasks()
    }

    @GetMapping(
        "/{id}",
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun getTask(@PathVariable id: Long): MutableList<TaskDto>? {
        return service.getTask(id)
    }

    @DeleteMapping("/{id}")
    fun delete(@RequestParam id: Long) {
        service.delete(id)
    }
}