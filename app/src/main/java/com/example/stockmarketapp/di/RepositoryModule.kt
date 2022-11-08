package com.example.stockmarketapp.di

import com.example.stockmarketapp.home.data.csv.CSVParser
import com.example.stockmarketapp.home.data.csv.CompanyListingsParser
import com.example.stockmarketapp.home.data.csv.IntradayInfoParser
import com.example.stockmarketapp.home.data.repository.StockRepositoryImpl
import com.example.stockmarketapp.home.domain.model.CompanyListing
import com.example.stockmarketapp.home.domain.model.IntradayInfo
import com.example.stockmarketapp.home.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}