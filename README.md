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
