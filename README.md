# 💧 Household Water Management System (Java)

A collection of three beginner-friendly, console-based Java programs that model a simple household water-usage and billing workflow: recording household details, totalling daily consumption, and calculating a water bill.

![Java](https://img.shields.io/badge/Java-8%2B-orange)
![Type](https://img.shields.io/badge/Type-Console%20Application-blue)
![Dependencies](https://img.shields.io/badge/Dependencies-None-brightgreen)

---

## 📑 Table of Contents

- [Overview](#-overview)
- [Project Structure](#-project-structure)
- [Features](#-features)
- [Prerequisites](#-prerequisites)
- [Getting Started](#-getting-started)
- [Program Details](#-program-details)
- [Concepts Demonstrated](#-concepts-demonstrated)
- [Possible Improvements](#-possible-improvements)
- [Author](#-author)

---

## 📖 Overview

This repository contains three independent programs, each focused on one part of water-usage tracking:

| Program | Purpose |
|---|---|
| `HouseholdDetail.java` | Collects and displays household information and usage status |
| `TotalWaterConsumption.java` | Adds morning and evening usage to produce a daily total |
| `WaterBillCalculator.java` | Calculates a bill based on a consumption threshold |

Every program validates user input in a loop, so invalid entries never crash the application. The user is simply asked again.

---

## 📁 Project Structure

```
.
├── HouseholdDetail.java
├── TotalWaterConsumption.java
├── WaterBillCalculator.java
├── screenshots/
│   ├── household-detail.png
│   ├── total-water-consumption.png
│   └── water-bill-calculator.png
└── README.md
```

---

## ✨ Features

- **Robust input validation:** rejects non-numeric, negative, and out-of-range values and re-prompts.
- **Clean console UI:** formatted headers, aligned output, and summary blocks.
- **Safe resource handling:** uses `try-with-resources` to close `Scanner` automatically.
- **Zero dependencies:** only the standard Java library is needed.
- **Self-contained programs:** each file compiles and runs on its own.

---

## 🛠 Prerequisites

- **Java Development Kit (JDK) 8 or higher**

Check your installation:

```bash
java -version
javac -version
```

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/Ghost-uchiha1/<your-repo-name>.git
cd <your-repo-name>
```

### 2. Compile

```bash
javac HouseholdDetail.java TotalWaterConsumption.java WaterBillCalculator.java
```

### 3. Run any program

```bash
java HouseholdDetail
java TotalWaterConsumption
java WaterBillCalculator
```

---

## 🔍 Program Details

### 1. `HouseholdDetail`

Captures a household's details and prints a formatted summary.

**Inputs**

| Field | Type | Validation |
|---|---|---|
| House number | `int` | Must be ≥ 1 |
| Family members | `int` | Must be ≥ 1 |
| Water consumed (litres) | `double` | Must be finite and ≥ 0 |
| Usage status | `char` | `H` (High), `M` (Medium), or `L` (Low), case-insensitive |

**Sample run**

![Household Detail sample run](screenshots/household-detail.png)

---

### 2. `TotalWaterConsumption`

Calculates total daily water usage from morning and evening readings.

**Inputs**

| Field | Type | Validation |
|---|---|---|
| Morning usage (litres) | `int` | Must be a whole number ≥ 0 |
| Evening usage (litres) | `int` | Must be a whole number ≥ 0 |

The logic is isolated in a reusable method:

```java
public static int calculateTotal(int morningUsage, int eveningUsage)
```

**Sample run**

![Total Water Consumption sample run](screenshots/total-water-consumption.png)

---

### 3. `WaterBillCalculator`

Computes a flat-rate bill depending on whether consumption exceeds a limit.

**Billing rules**

| Consumption | Bill |
|---|---|
| ≤ 500 litres | Rs. 100 |
| > 500 litres | Rs. 200 |

The limit and rates are defined as constants (`LIMIT_LITRES`, `LOW_BILL`, `HIGH_BILL`) so they are easy to change.

**Sample run**

![Water Bill Calculator sample run](screenshots/water-bill-calculator.png)

---

## 🎓 Concepts Demonstrated

- Console I/O with `Scanner`
- Input validation using `while (true)` loops and `try-catch`
- Exception handling (`NumberFormatException`)
- Conditional logic (`if-else`, `switch`)
- Constants with `static final`
- Method decomposition and reusable helper methods
- Formatted output with `System.out.printf`
- `try-with-resources` for resource management

---

## 🔮 Possible Improvements

- Merge the three programs into a single menu-driven application
- Introduce tiered (slab-based) billing instead of a flat rate
- Derive the usage status (H/M/L) automatically from consumption and family size
- Persist household records to a file or database
- Add unit tests with JUnit (e.g., for `calculateTotal`)
- Build with Maven or Gradle

---

## 👤 Author

**Ghost-uchiha1**
GitHub: [@Ghost-uchiha1](https://github.com/Ghost-uchiha1)
