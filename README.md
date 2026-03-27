# Java Multithreading Problems

Five Java programs demonstrating multithreading concepts like `Runnable`, `Thread`, priorities, and `sleep()`.

---

## Files

| File | Problem |
|------|---------|
| `BankAccountSimulation.java` | Multiple users checking bank balance concurrently |
| `SmartHomeAutomation.java` | Smart home devices running on separate threads |
| `FoodDeliverySystem.java` | Food orders processed by delivery agents simultaneously |
| `ExamHallManagement.java` | Exam hall activities coordinated with delays |
| `CustomerSupportSystem.java` | Support tickets handled by priority |

---

## How to Run

```bash
# Compile
javac BankAccountSimulation.java

# Run
java BankAccountSimulation
```

Repeat for each file.

---

## Concepts Used

- `Runnable` interface (Problems 1, 2, 3, 4)
- Extending `Thread` class (Problem 5)
- `Thread.sleep()` for simulating delays
- `Thread.setPriority()` for execution preference
- `Thread.join()` to wait for threads to finish
- Thread states: NEW, RUNNABLE, TERMINATED

---

## Thread Priorities Used

| Priority | Meaning |
|----------|---------|
| 10 | Highest (Critical / Premium / Security) |
| 5–8 | Medium (Standard / Regular) |
| 1–3 | Lowest (Basic / Economy) |

> Note: Thread priority is a hint to the JVM scheduler — actual execution order may vary by OS.