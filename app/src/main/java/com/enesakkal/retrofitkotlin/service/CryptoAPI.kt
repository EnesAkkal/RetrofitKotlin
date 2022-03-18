package com.enesakkal.retrofitkotlin.service

import android.database.Observable
import com.enesakkal.retrofitkotlin.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST

interface CryptoAPI {

    //atilsamancioglu/K21-JSONDataSet/master/crypto.json"

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")

    fun getData(): Call<List<CryptoModel>>

}