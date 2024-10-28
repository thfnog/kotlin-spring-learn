package com.learning.kotlin.domain

import com.learning.kotlin.dto.TaskDto
import jakarta.persistence.*

@Entity
class Task(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column(name = "name")
    val name: String,
    @Column(name = "status")
    val status: String
) {
    init {
        requireNotNull(name)

        requireNotNull(status)
    }

    fun toDto() = TaskDto(id, name, status)
}