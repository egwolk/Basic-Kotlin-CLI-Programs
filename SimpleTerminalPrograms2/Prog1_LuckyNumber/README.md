# **Prog1_LuckyNumber (Guess the Lucky Number Game)**

## **Description**
This fun program challenges the user to guess a "lucky number," which is calculated as the last digit of the user's entered ID number. It provides feedback for each guess and tells the user how many attempts it took to guess correctly.

## **Features**
- Dynamically calculates the "lucky number" based on the last digit of the provided ID number.
- Validates user input for both the ID and guesses.
- Tracks the number of attempts required to guess the correct number.
- Provides clear and interactive feedback to guide the user.

## **How to Run**
1. **Prerequisites**:
   - Ensure you have a Java Runtime Environment installed.
2. **Steps**:
   - Open the folder containing the `.bat` (Windows) or `.sh` (Linux/macOS) file.
   - Run the appropriate file for your operating system:
     - **Windows**: Double-click the `.bat` file.
     - **Linux/macOS**: Execute the `.sh` file in your terminal using the command:
       ```bash
       sh filename.sh
       ```

## **Example Usage**
### **Case 1: Correct Guess**
#### **Input**:
- Enter your ID number: `12345`
- Guess the lucky number: `5`

#### **Output**:
```plaintext
Congrats, you got it!
5 is the lucky number!
It took you 1 try to guess it.
```

### **Case 2: Multiple Incorrect Guesses**
#### **Input**:
- Enter your ID number: 98765
- Guess the lucky number: `3`
- Guess the lucky number: `8`
- Guess the lucky number: `5`

#### **Output**:
```plaintext
Oops! 3 is not the lucky number. Try again!
Oops! 8 is not the lucky number. Try again!
Congrats, you got it!
5 is the lucky number!
It took you 3 tries to guess it.
```

### **Invalid Input Example**
#### **Input**:
- Enter your ID number: `abc`

#### **Output**:
```plaintext
Error: Invalid input. Try again.
```

---
## **Technologies Used**
- **Language**: Kotlin
- **IDE**: IntelliJ IDEA (or other compatible IDEs)

## License
This project is licensed under the [MIT License](../../LICENSE).

## **Author**
Made with 💗 by Erin (GitHub: [@egwolk](https://github.com/ewgolk))  
