package com.example.expensetracker.viewmodel

import android.content.Context
import com.example.expensetracker.R
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.expensetracker.Utils
import com.example.expensetracker.data.ExpenseDatabase
import com.example.expensetracker.data.dao.ExpenseDao
import com.example.expensetracker.data.model.ExpenseEntity




class HomeViewModel(dao: ExpenseDao) : ViewModel() {
    val expenses = dao.getAllExpenses()
    fun getBalance(list:List<ExpenseEntity>): String{
        var balance = 0.0
        for (expense in list) {
            if(expense.type=="Income"){
                balance += expense.amount
            }else{
                balance -= expense.amount
            }
        }
        return "₹ ${Utils.formatToDecimalValue(balance)}"

    }
    fun getTotalExpense(list:List<ExpenseEntity>) : String {
        var total = 0.0
        list.forEach {
            if(it.type == "Expense"){
                total += it.amount
            }
        }
        return "₹ ${Utils.formatToDecimalValue(total)}"

    }
    fun getTotalIncome(list:List<ExpenseEntity>): String{
        var totalIncome = 0.0
        list.forEach {
            if(it.type=="Income"){
                totalIncome += it.amount
            }
        }
        return "₹ ${Utils.formatToDecimalValue(totalIncome)}"

    }
    fun getItemIcon(item: ExpenseEntity): Int{
         if (item.category == "Paypal"){
            return R.drawable.ic_paypal
        }else if (item.category == "Netflix"){
            return R.drawable.ic_netflix
        }else if (item.category == "Starbucks"){
            return R.drawable.ic_starbucks
        }
        return R.drawable.ic_upwork
    }
}

class HomeViewModelFactory(private val context: Context) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val dao = ExpenseDatabase.getDatabase(context).expenseDao()
        return HomeViewModel(dao) as T
    }
}