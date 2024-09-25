package com.learning.kotlin.controller

data class TaskDto(
    val id: Long? = null,
    val name: String?,
    val status: String?
)