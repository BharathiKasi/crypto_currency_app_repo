package com.example.cryptopcurrencyapp.data.remote

import com.example.cryptopcurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptopcurrencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikApi {

    @GET("/v1/coins")
    suspend fun getCoinDto() :List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinDetailById(@Path("coinId") pCoinId:String):CoinDetailDto
}