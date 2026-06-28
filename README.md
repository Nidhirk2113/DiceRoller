# 🎲 Dice Roller App

A simple and interactive Android application built using **Kotlin** that simulates rolling two dice. The app displays random dice faces, plays a dice rolling sound effect, and shows a unique message for every possible dice combination.

---

## 📱 Features

* Roll two virtual dice with a single tap.
* Displays random dice faces (1–6).
* Plays a realistic dice rolling sound.
* Shows a unique comment for all **36 possible dice combinations**.
* Clean and user-friendly interface.
* Lightweight and easy to understand for Android beginners.

---

## 🛠️ Tech Stack

* **Language:** Kotlin
* **IDE:** Android Studio
* **Framework:** Android SDK
* **UI Components:**

  * ImageView
  * Button
  * TextView
* **Media:** MediaPlayer API

---

## 📂 Project Structure

```
app/
├── java/
│   └── com.example.diceroller/
│       └── MainActivity.kt
│
├── res/
│   ├── drawable/
│   │   ├── dice_1.png
│   │   ├── dice_2.png
│   │   ├── dice_3.png
│   │   ├── dice_4.png
│   │   ├── dice_5.png
│   │   └── dice_6.png
│   │
│   ├── layout/
│   │   └── activity_main.xml
│   │
│   └── raw/
│       └── dice_roll.mp3
│
└── AndroidManifest.xml
```

---

## 🚀 How It Works

1. Launch the application.
2. Tap the **Roll Dice** button.
3. A dice rolling sound is played.
4. Two random numbers between **1 and 6** are generated.
5. The corresponding dice images are displayed.
6. A personalized message is shown based on the rolled combination.

---

## 🎯 Dice Logic

* Generates two random values using:

```kotlin
val dice1 = (1..6).random()
val dice2 = (1..6).random()
```

* Updates dice images dynamically.

* Uses a `when` expression with `Pair(dice1, dice2)` to provide a unique response for each of the 36 outcomes.

Example:

```kotlin
Pair(6,6) -> "🎉 Double six! Ultimate roll!"
Pair(1,1) -> "Snake eyes! Very unlucky!"
Pair(5,5) -> "Double fives! Jackpot!"
```

## ▶️ Installation

1. Clone the repository.

```bash
git clone https://github.com/your-username/DiceRoller.git
```

2. Open the project in **Android Studio**.

3. Sync Gradle dependencies.

4. Run the application on:

   * Android Emulator
   * Physical Android Device

---

## 📋 Requirements

* Android Studio
* Android SDK 24+
* Kotlin
* Gradle

---

## 🔮 Future Enhancements

* Dice rolling animation.
* Roll history.
* Score tracking.
* Multiplayer mode.
* Dark mode support.
* Shake-to-roll using device sensors.
* Custom themes and dice styles.

---

## 📚 Learning Outcomes

This project demonstrates:

* Android Activity lifecycle
* Kotlin programming basics
* Event handling with Button listeners
* Random number generation
* ImageView manipulation
* MediaPlayer integration
* Conditional logic using `when`
* Basic Android UI design

---

## 👩‍💻 Author

**Nidhi Kulkarni**

Computer Science & Design Engineering

---

## 📄 License

This project is intended for educational and learning purposes.
