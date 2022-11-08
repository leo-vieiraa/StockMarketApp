package com.example.stockmarketapp.home.domain.repository

import com.example.stockmarketapp.home.domain.model.CompanyInfo
import com.example.stockmarketapp.home.domain.model.CompanyListing
import com.example.stockmarketapp.home.domain.model.IntradayInfo
import com.example.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}