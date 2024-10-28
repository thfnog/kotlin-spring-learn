package com.learning.kotlin.controller.json

data class TaskResponse(
    val id: Long? = null,
    val name: String?,
    val status: String?
)