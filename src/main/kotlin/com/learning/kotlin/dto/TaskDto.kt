package com.learning.kotlin.dto

import com.learning.kotlin.controller.json.TaskResponse
import com.learning.kotlin.domain.Task

data class TaskDto(
    var id: Long? = null,
    var name: String?,
    var status: String?
) {
    fun toResponse() = TaskResponse(id, name, status)
    fun toEntity() = Task(id, name!!, status!!)
}