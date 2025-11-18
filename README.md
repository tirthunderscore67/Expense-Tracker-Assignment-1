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

Simple bar chart to visualize expenses

🗂 Categories

Food

Travel

Shopping

Utilities

Others

🔥 Tech Stack

Kotlin

Jetpack Compose for UI

Room Database for local storage

ViewModel + LiveData / StateFlow

Material 3 Components

MVVM Architecture

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
│   ├── screens/ → Add, Home, Stats
│   ├── components/ → Reusable UI components
│
├── utils/ → Helper functions (date formatter, etc.)

▶️ How to Run the App

Download or clone the project

Open it in Android Studio

Make sure you have:

Compose enabled

Room dependencies added

Sync Gradle

Run on emulator or real device

🗄 Room Database Structure
Table: expenses
{
  "id": 1,
  "name": "Lunch",
  "amount": 150,
  "date": "20 Nov 2025",
  "category": "Food",
  "type": "Expense"
}

🔮 Future Improvements

Data backup to Firebase

Export expenses to PDF

More detailed analytics

Dark mode

Budget alerts
