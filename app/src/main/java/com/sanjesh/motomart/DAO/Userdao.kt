package com.sanjesh.motomart.DAO

import androidx.room.Insert
import androidx.room.Query
import com.sanjesh.motomart.Entity.User

interface Userdao { @Insert
suspend fun registerUser(user:User)
    @Query("Select * from User")
    suspend fun checkUser(): User
    @Query("Delete from User")
    suspend fun delete()
}