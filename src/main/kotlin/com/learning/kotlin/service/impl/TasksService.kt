package com.learning.kotlin.service.impl

import com.learning.kotlin.dto.TaskDto
import com.learning.kotlin.repository.TasksRepository
import com.learning.kotlin.service.ITasksService
import org.springframework.stereotype.Service
import java.util.stream.Collectors
import kotlin.jvm.optionals.getOrElse

@Service
class TasksService(
    private val repository: TasksRepository
) : ITasksService {

    override fun create(taskDto: TaskDto) {
        repository.save(taskDto.toEntity())
    }

    override fun getTasks(): MutableList<TaskDto>? {
        return repository.findAll().stream()
            .map { task -> task!!.toDto() }
            .collect(Collectors.toList())
    }

    override fun getTask(id: Long): TaskDto? {
        if (!repository.existsById(id)) throw Exception("Task not exists.")

        return repository.findById(id).stream()
            .map { task -> task!!.toDto() }
            .findAny()
            .getOrElse { TaskDto(null, null, null) }
    }

    override fun update(id: Long, taskDto: TaskDto) {
        if (!repository.existsById(id)) throw Exception("Task not exists.")

        taskDto.id = id
        repository.save(taskDto.toEntity())
    }

    override fun delete(id: Long) {
        if (!repository.existsById(id)) throw Exception("Task not exists.")

        repository.deleteById(id)
    }

}