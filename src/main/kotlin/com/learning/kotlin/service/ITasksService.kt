package com.learning.kotlin.service

import com.learning.kotlin.dto.TaskDto

interface ITasksService {
    fun create(taskDto: TaskDto)
    fun getTasks(): MutableList<TaskDto>?
    fun getTask(id: Long): TaskDto?
    fun update(id: Long, taskDto: TaskDto)
    fun delete(id: Long)
}