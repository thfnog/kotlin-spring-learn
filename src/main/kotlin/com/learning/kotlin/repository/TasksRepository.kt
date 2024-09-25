package com.learning.kotlin.repository

import com.learning.kotlin.domain.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TasksRepository : JpaRepository<Task?, Long?>