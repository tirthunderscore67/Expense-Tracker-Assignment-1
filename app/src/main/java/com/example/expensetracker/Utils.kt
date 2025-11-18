package com.example.expensetracker

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object Utils {

    fun formateDateToHumanReadableForm(dateInMillis: Long): String {
        val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        return sdf.format(Date(dateInMillis))
    }
    fun formatToDecimalValue(d: Double): String {
        return String.format("%.2f", d)
    }
}
