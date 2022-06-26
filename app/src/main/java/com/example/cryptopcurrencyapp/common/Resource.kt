package com.example.cryptopcurrencyapp.common

sealed class Resource<T>(private val pData:T? = null, private val pErrorMessage: String? = null,private val pLoadingMessage:String?=null){
     class Success<T>(  pData: T) : Resource<T>(pData)
     class Error<T> (   pErrorMessage: String) : Resource<T>(pErrorMessage = pErrorMessage)
     class Loading<T>(pLoadingMessage: String) : Resource<T>(pLoadingMessage = pLoadingMessage)

}


