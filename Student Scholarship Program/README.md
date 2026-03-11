# 🎓 Student Scholarship Management Program (Java)

## 📌 Project Description

This is a simple **Java console application** that collects information about students and determines their scholarship eligibility based on their **exam marks and family monthly income**.

The program allows the user to input data for **5 students** and categorizes them into different scholarship levels.

---

## ⚙️ Features

* Input student name
* Input student marks (0 – 100)
* Input family monthly income
* Validate marks input
* Determine scholarship category
* Display student details
* Count total number of students eligible for scholarships

---

## 🏆 Scholarship Categories

| Marks Range | Income Condition    | Scholarship Type    |
| ----------- | ------------------- | ------------------- |
| 85 – 100    | Income < 100,000    | Full Scholarship    |
| 70 – 84     | Income < 150,000    | Half Scholarship    |
| 55 – 69     | No income condition | Partial Scholarship |
| Below 55    | —                   | Not Eligible        |

---

## 🖥️ Technologies Used

* Java
* Scanner Class
* Loops (`for`)
* Conditional Statements (`if-else`)
* Input Validation

---

## 📂 Project Structure

```
Student/
 ├── Student.java
 └── README.md
```

---

## ▶️ How to Run the Program

1. Clone the repository

```
git clone https://github.com/your-username/student-scholarship-system.git
```

2. Navigate to the project folder

```
cd student-scholarship-system
```

3. Compile the Java program

```
javac Student.java
```

4. Run the program

```
java Student
```

---

## 📌 Example Output

```
Enter Students Name: Kamal
Enter Marks(0-100): 90
Family Monthly Income: 80000

Student Name: Kamal
Student Marks: 90
Monthly Income : Rs. 80000
Scholarship Category : Full Scholarship...!
```

---

## 📊 Program Logic

1. The program runs a **loop for 5 students**.
2. Marks are validated to ensure they are between **0 and 100**.
3. Scholarship category is determined using **if-else conditions**.
4. Eligible students are counted.
5. At the end, the program displays the **total scholarship recipients**.

---

## 📖 Learning Purpose

This project helps beginners understand:

* Java input handling
* Loops and conditions
* Program logic building
* Basic student data processing

---

## 👨‍💻 Author

Student Java Practice Project

---
