💰 Expense Tracker App (Android – Kotlin + Room + Jetpack Compose)

This is my 3rd Year Computer Engineering project for Mobile App Development.
It’s a simple and clean Expense Tracker application where users can add, view, categorize, and track their expenses.

🚀 Features
➕ Add Expenses

Add name, amount, date, category, and type

Auto-formatted date

Data stored locally using Room Database

📋 View Expenses

List of all expenses

Real-time updates

Organized by category and type

📊 Expense Summary

Total Income

Total Expense

Balance

🔥 Tech Stack

Kotlin

Jetpack Compose

Room Database

MVVM Architecture

ViewModel

📂 Project Structure
app/
├── data/
│   ├── dao/ → ExpenseDao.kt
│   ├── model/ → ExpenseEntity.kt
│   ├── ExpenseDataBase.kt
│
├── viewmodel/
│   ├── HomeViewModel.kt
│   ├── AddExpenseViewModel.kt
│
├── ui/
│   ├── screens/ → Add, Home
│   ├── components/ → Reusable UI components
│
├── utils/ → Helper functions (date formatter, etc.)

▶️ How to Run the App

Clone or download the project

Open it in Android Studio

Sync Gradle

Run the app on emulator or device

🔮 Future Improvements

Firebase sync

Export to PDF

Better analytics

Dark theme
