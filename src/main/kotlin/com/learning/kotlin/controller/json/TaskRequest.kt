package com.learning.kotlin.controller.json

import com.learning.kotlin.dto.TaskDto

data class TaskRequest(
    val name: String?,
    val status: String?
) {
    fun toDto() = TaskDto(null, name, status)
}