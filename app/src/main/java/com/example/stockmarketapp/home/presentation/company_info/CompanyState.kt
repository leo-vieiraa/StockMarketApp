package com.example.stockmarketapp.home.presentation.company_info

import com.example.stockmarketapp.home.domain.model.CompanyInfo
import com.example.stockmarketapp.home.domain.model.IntradayInfo

data class CompanyState(
    val stockInfo: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)