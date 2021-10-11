package com.example.postrequest

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {
    @GET("/test/")
    fun doGetListResources(): Call<List<UserDetails.User>>
    @POST("/test/")
    fun addUser(
        @Body userData:UserDetails.User
    ):Call<UserDetails.User>

}