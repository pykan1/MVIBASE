package com.example.talk.data.local.repository

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.talk.data.local.model.UserModel

@Dao
interface UserRepository {

    @Insert
    suspend fun insertUser(userModel: UserModel)

    @Query("select * from user")
    suspend fun getUser(): UserModel

    @Query("delete from user")
    suspend fun deleteUser()

    //Пример

}