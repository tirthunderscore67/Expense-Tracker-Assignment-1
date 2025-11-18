package com.example.expensetracker.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.expensetracker.data.ExpenseDatabase
import com.example.expensetracker.data.model.ExpenseSummary
import com.example.expensetracker.Utils
import com.github.mikephil.charting.data.Entry

class StatsViewModel(private val dao: com.example.expensetracker.data.dao.ExpenseDao) : ViewModel() {

    val expensesByDate = dao.getAllExpenseByDate()

    fun getEntriesForChart(list: List<ExpenseSummary>): Pair<List<Entry>, List<String>> {
        val entries = mutableListOf<Entry>()
        val labels = mutableListOf<String>()
        var index = 0f

        for (item in list) {
            entries.add(Entry(index, item.total_amount.toFloat()))
            labels.add(Utils.formateDateToHumanReadableForm(item.date))
            index += 1f
        }
        return Pair(entries, labels)
    }
}

class StatsViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val dao = ExpenseDatabase.getDatabase(context).expenseDao()
        return StatsViewModel(dao) as T
    }
}
