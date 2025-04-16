# **Day of the Week Program**

## **Description**
This program allows the user to input a number (from 1 to 7) and returns the corresponding day of the week based on the standard format where:
- 1 = Monday
- 7 = Sunday  

The program also provides input validation to ensure the number is within the valid range.

## **Features**
- Maps numbers (1-7) to their corresponding days of the week.
- Validates input to ensure only numbers between 1 and 7 are accepted.
- Includes a fun commentary to challenge perceptions about the starting day of the week.
- Clears the console for better readability.

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
### **Case 1: Valid Input**
#### **Input**:
- Enter a number from 1-7: `3`

#### **Output**:
```plaintext
3 is Wednesday
P.S. If you think Sunday is the first day, you are wrong.
```

### **Invalid Input Example**
#### **Input**:
- Enter a number from 1-7: `9`

#### **Output**:
```plaintext
Error: Invalid input.
```

### **Edge Case**
#### **Input**:
- Enter a number from 1-7: `7`

#### **Output**:
```plaintext
7 is Sunday
P.S. If you think Sunday is the first day, you are wrong.
```

---
## **Technologies Used**
- **Language**: Kotlin
- **IDE**: IntelliJ IDEA (or other compatible IDEs)

## License
This project is licensed under the [MIT License](../../LICENSE).

## **Author**
Made with 💗 by Erin (GitHub: [@egwolk](https://github.com/ewgolk))  
