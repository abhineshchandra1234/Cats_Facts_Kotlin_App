package com.abhinesh.retrofit


import com.abhinesh.retrofit.api.CatJson
import retrofit2.http.GET

interface ApiRequests {

    @GET("/facts/random")
    fun getCatFacts(): retrofit2.Call<CatJson>
}