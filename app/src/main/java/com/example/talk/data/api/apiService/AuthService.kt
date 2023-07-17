package com.example.talk.data.api.apiService

import com.example.talk.data.api.model.AuthModel
import com.example.talk.data.api.model.UserResponseModel
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {

    // Описываете запросы как в примере(его можно потом удалить)

    @POST("login")
    suspend fun login(@Body request: AuthModel): UserResponseModel

    //Соответственно, AuthModel тело запроса, UserResponseModel, то что ожидается на в ответе запроса

}