package com.learning.kotlin.service

import com.learning.kotlin.controller.TaskDto
import com.learning.kotlin.domain.Task
import com.learning.kotlin.repository.TasksRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class TasksService(
    private val repository: TasksRepository
) {

    fun create(taskDto: TaskDto) {
        repository.save(mapTaskDtoToTask(taskDto))
    }

    fun getTasks(): MutableList<TaskDto>? {
        return repository.findAll().stream()
            .map{task -> mapTaskToTaskDto(task)}
            .collect(Collectors.toList())
    }

    fun getTask(id: Long): MutableList<TaskDto>? {
        return repository.findById(id).stream()
            .map{task -> mapTaskToTaskDto(task)}
            .collect(Collectors.toList())
    }

    fun update(id: Long, taskDto: TaskDto) {
        repository.save(mapTaskDtoToTask(taskDto))
    }

    fun delete(id: Long) {
        repository.deleteById(id)
    }

    private fun mapTaskToTaskDto(task: Task?): TaskDto {
        return TaskDto(name = task!!.name, status = task.status)
    }

    private fun mapTaskDtoToTask(task: TaskDto?): Task {
        return Task(id = task!!.id, name = task.name!!, status = task.status!!)
    }

}