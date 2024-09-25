package com.learning.kotlin.domain

import jakarta.persistence.*

@Entity
class Task (
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
}