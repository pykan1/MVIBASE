package com.example.talk.data.api.remoteDataSource

import com.example.talk.data.api.apiService.AuthService
import com.example.talk.data.api.model.AuthModel
import javax.inject.Inject

class AuthRemoteDataSource @Inject constructor(
    private val authService: AuthService
) {

    suspend fun login(authModel: AuthModel) = authService.login(authModel) //как пример

}