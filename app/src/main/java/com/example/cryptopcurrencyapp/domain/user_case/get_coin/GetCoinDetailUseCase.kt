package com.example.cryptopcurrencyapp.domain.user_case.get_coin

import com.example.cryptopcurrencyapp.common.Resource
import com.example.cryptopcurrencyapp.data.remote.dto.toCoin
import com.example.cryptopcurrencyapp.data.remote.dto.toCoinDetail
import com.example.cryptopcurrencyapp.domain.model.Coin
import com.example.cryptopcurrencyapp.domain.model.CoinDetail
import com.example.cryptopcurrencyapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception

class GetCoinDetailUseCase(val pCoinRepository: CoinRepository) {

    operator fun invoke(pcoindId:String): Flow<Resource<CoinDetail>> = flow{
        try {
            emit(Resource.Loading("Please wait"))
            val lCoin = pCoinRepository.getCoinById(pcoindId).toCoinDetail()
            emit(Resource.Success(lCoin))
        }catch (e:Exception){
            emit(Resource.Error(e.message!!))
            e.printStackTrace()
        }
    }
}