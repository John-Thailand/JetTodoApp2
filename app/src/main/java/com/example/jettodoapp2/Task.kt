package com.example.jettodoapp2

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var title: String,
    var description: String,
)
