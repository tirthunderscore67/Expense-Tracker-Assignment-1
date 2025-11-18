# 💰 Expense Tracker App (Android – Kotlin + Room + Jetpack Compose)

This is my **3rd Year Computer Engineering project** for Mobile App Development.  
It’s a simple and clean **Expense Tracker** application where users can add, view, categorize, and track their expenses.

---

## 🚀 Features

### ✍️ Add Expenses
- Add **name**, **amount**, **date**, **category**, and **type** (Income / Expense)  
- Auto-formatted date  
- Data stored locally using **Room Database**

---

### 📒 View Expenses
- List of all expenses  
- Real-time updates using **Flow / LiveData**  
- Organized by **category** and **type**

---

### 📊 Expense Summary
- Total **Income**  
- Total **Expense**  
- Current **Balance**  

---
📂 Project Structure

app/
├── data/
│ ├── dao/ → ExpenseDao.kt
│ ├── db/ → ExpenseDatabase.kt
│ └── model/ → ExpenseEntity.kt
│
├── ui/
│ ├── add/ → Add Expense screen (Jetpack Compose)
│ ├── home/ → Home / Expense list
│ └── summary/ → Expense summary (Income, Expense, Balance)
│
└── viewmodel/ → HomeViewModel, AddExpenseViewModel

🛠 Technologies Used

Kotlin

Jetpack Compose

Room Database

MVVM Architecture

Coroutines / Flow

▶️ How to Run the App

Clone or download this repository.

Open the project in Android Studio.

Let Gradle sync automatically.

Run the app on an emulator or physical Android device (API 24+ recommended).

🔮 Future Improvements

Filter by date range and category

Export expenses to CSV / PDF

Add Dark Mode

Add charts for visual expense analysis

## 🗄 Local Database (Room)

### `expenses` table
```json
{
  "id": 1,
  "name": "Groceries",
  "amount": 1200.0,
  "date": "14 Nov 2025",
  "category": "Food",
  "type": "Expense"
}













