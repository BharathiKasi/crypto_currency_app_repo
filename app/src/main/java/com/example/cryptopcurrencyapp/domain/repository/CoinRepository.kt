package com.example.cryptopcurrencyapp.domain.repository

import com.example.cryptopcurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptopcurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins():List<CoinDto>

    suspend fun getCoinById(pCoinId:String) : CoinDetailDto

    fun test(){
        println("test")
    }
}