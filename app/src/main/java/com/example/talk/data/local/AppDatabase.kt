package com.example.talk.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.talk.data.local.model.UserModel
import com.example.talk.data.local.repository.UserRepository

@Database(entities = [UserModel::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserRepository
}