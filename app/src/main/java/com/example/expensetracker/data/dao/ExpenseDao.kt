package com.example.expensetracker.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.expensetracker.data.model.ExpenseEntity
import com.example.expensetracker.data.model.ExpenseSummary
import kotlinx.coroutines.flow.Flow

@Dao
interface ExpenseDao {

    @Query("SELECT * FROM expense_table ORDER BY id DESC")
    fun getAllExpenses(): Flow<List<ExpenseEntity>>

    @Insert
    suspend fun insertExpense(expense: ExpenseEntity)

    @Query("""
        SELECT date,
               SUM(amount) AS total_amount,
               type
        FROM expense_table
        WHERE type = 'Expense'
        GROUP BY date
        ORDER BY date
    """)
    fun getAllExpenseByDate(): Flow<List<ExpenseSummary>>
}
