package com.example.stockmarketapp.home.data.mapper

import com.example.stockmarketapp.home.data.local.CompanyListingEntity
import com.example.stockmarketapp.home.data.remote.dto.CompanyInfoDto
import com.example.stockmarketapp.home.domain.model.CompanyInfo
import com.example.stockmarketapp.home.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing() : CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity() : CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}