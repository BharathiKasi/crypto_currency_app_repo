package com.example.cryptopcurrencyapp.data.repository

import com.example.cryptopcurrencyapp.data.remote.CoinPaprikApi
import com.example.cryptopcurrencyapp.data.remote.dto.CoinDetailDto
import com.example.cryptopcurrencyapp.data.remote.dto.CoinDto
import com.example.cryptopcurrencyapp.domain.repository.CoinRepository

class CoinDetailRepositoryImpl(val pApi:CoinPaprikApi) : CoinRepository{
    override  suspend fun getCoinById(pCoinId: String): CoinDetailDto {
        return pApi.getCoinDetailById(pCoinId = pCoinId)
    }

    override suspend fun getCoins(): List<CoinDto> {
      return pApi.getCoinDto()
    }

    override fun test() {
        print("text")
    }

}