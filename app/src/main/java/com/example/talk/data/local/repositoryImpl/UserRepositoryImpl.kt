package com.example.talk.data.local.repositoryImpl

import com.example.talk.data.local.model.UserModel
import com.example.talk.data.local.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userRepository: UserRepository
) {

    suspend fun getUser() = userRepository.getUser()

    suspend fun deleteUser() = userRepository.deleteUser()

    suspend fun insertUser(userModel: UserModel) = userRepository.insertUser(userModel)

    //Пример
}