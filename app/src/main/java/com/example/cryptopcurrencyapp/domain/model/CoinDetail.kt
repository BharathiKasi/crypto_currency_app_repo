package com.example.cryptopcurrencyapp.domain.model

import com.example.cryptopcurrencyapp.data.remote.dto.Tag
import com.example.cryptopcurrencyapp.data.remote.dto.TeamMember

data class CoinDetail(
    val id:String,
    val name:String,
    val description:String,
    val symbol:String,
    val rank:Int,
    val isActive:Boolean,
    val tags:List<Tag>,
    val team:List<TeamMember>
)
