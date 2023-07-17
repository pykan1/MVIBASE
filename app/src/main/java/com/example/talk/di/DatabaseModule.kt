package com.example.talk.di

import android.content.Context
import androidx.room.Room
import com.example.talk.data.api.apiService.AuthService
import com.example.talk.data.local.AppDatabase
import com.example.talk.data.local.repository.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@InstallIn(SingletonComponent::class)
@Module
object DatabaseModule {

    @Provides
    fun provideUserDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return Room.databaseBuilder(
            appContext,
            AppDatabase::class.java,
            "user"
        ).build()
    }

    @Provides
    fun provideUserDao(appDatabase: AppDatabase): UserRepository {
        return appDatabase.userDao()
    }

    @Provides
    fun provideAuthService(): AuthService {
        return Retrofit.Builder()
            .baseUrl("http://127.0.0.1:8001")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AuthService::class.java)
    }

    // Пример создания di, что бы легко, красиво и удобно можно было общаться с хранилещем и сервером, так, чтобы зависимости сами подсасывались

}