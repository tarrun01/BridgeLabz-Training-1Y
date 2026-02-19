# Java Packages – All 10 Questions

## Project Structure Overview

```
java_packages_project/
├── Q1/   - User-Defined Packages (college.student, college.faculty)
├── Q2/   - Package Hierarchy (com.university.department.cse)
├── Q3/   - Static Import Demonstration (java.lang.Math.*)
├── Q4/   - Modular Programming Java 9+ (module-info.java)
├── Q5/   - Library Management System (library.books/members/transactions)
├── Q6_Employee/ - Employee Management System (com.company.hr/payroll/main)
├── Q6_Student/  - Student Performance Analyzer (com.school.data/util/main)
├── Q7/   - Banking System with Static Import (com.bank.util)
├── Q8/   - Package Access Modifier Control (com.access.one/two)
├── Q9/   - Company Analytics with Sub-Packages (com.company.analytics.*)
└── Q10/  - Mini Project: College Management System (college.*)
```

---

## How to Compile & Run Each Question

### Q1 – User-Defined Packages
```
cd Q1
javac college/student/Student.java
javac college/faculty/Faculty.java
javac MainApp.java
java MainApp
```

### Q2 – Package Hierarchy
```
cd Q2
javac com/university/department/cse/Course.java
javac MainApp.java
java MainApp
```

### Q3 – Static Import
```
cd Q3
javac StaticImportDemo.java
java StaticImportDemo
```

### Q4 – Modular Programming (Java 9+)
```
cd Q4
mkdir -p mods
javac -d mods/collegeinfo collegeinfo/module-info.java collegeinfo/college/student/Student.java
javac --module-path mods -d mods/app app/module-info.java app/MainApp.java
java --module-path mods -m app/MainApp
```

### Q5 – Library Management System
```
cd Q5
javac library/books/Book.java
javac library/members/Member.java
javac library/transactions/Transaction.java
javac LibraryMain.java
java LibraryMain
```

### Q6_Employee – Employee Management System
```
cd Q6_Employee
javac com/company/hr/Employee.java
javac com/company/payroll/Payroll.java
javac com/company/main/MainApp.java
java com.company.main.MainApp
```

### Q6_Student – Student Performance Analyzer
```
cd Q6_Student
javac com/school/data/Student.java
javac com/school/util/Analyzer.java
javac com/school/main/MainApp.java
java com.school.main.MainApp
```

### Q7 – Banking System with Static Import
```
cd Q7
javac com/bank/util/InterestCalculator.java
javac BankingMain.java
java BankingMain
```

### Q8 – Access Modifier Control
```
cd Q8
javac com/access/one/Base.java
javac com/access/two/Derived.java
javac AccessMain.java
java AccessMain
```

### Q9 – Company Analytics
```
cd Q9
javac com/company/analytics/sales/SalesReport.java
javac com/company/analytics/hr/EmployeeReport.java
javac CompanyMain.java
java CompanyMain
```

### Q10 – College Management System
```
cd Q10
javac college/student/Student.java
javac college/faculty/Faculty.java
javac college/department/Department.java
javac college/main/MainApp.java
java college.main.MainApp
```

---

## Key Concepts Covered

| Question | Topic |
|----------|-------|
| Q1  | Creating and using user-defined packages |
| Q2  | Package hierarchy and nested sub-packages |
| Q3  | `import static` – five Math methods demonstrated |
| Q4  | Java 9+ modules, `module-info.java`, `--module-path` |
| Q5  | Real-world package design (Library System) |
| Q6a | Multi-package project with encapsulation |
| Q6b | Data analytics across packages |
| Q7  | Static import with Math.pow for interest formulae |
| Q8  | Access modifiers across packages (public/protected/default/private) |
| Q9  | Sub-packages and their independence |
| Q10 | Combined mini-project – College Management System |
