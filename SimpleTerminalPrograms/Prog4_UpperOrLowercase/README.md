# **Prog4_UpperOrLowercase (Letter Case Detection)**

## **Description**
This program determines whether the user-inputted letter from the English alphabet is:
- Lowercase
- Uppercase
- Neither (if the input is invalid or not part of the English alphabet)  

It provides a robust validation system to ensure only single characters from the English alphabet are accepted.

## **Features**
- Detects whether a letter is uppercase or lowercase.
- Rejects invalid inputs, such as multiple characters or non-alphabetic entries.
- Offers two methods for detection:
  - Explicit check for English alphabet characters using ASCII codes.
  - Inclusive check using Kotlin's built-in methods for broader alphabets.
- Includes functionality to clear the console for better user experience.

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
### **Input**:
- Enter one letter: `A`

### **Output**:
```plaintext
A is in uppercase.
```

## **Another Example**
### **Input**:
- Enter one letter: `b`

### **Output**:
```plaintext
b is in lowercase.
```
## **Invalid Input**
### **Input**:
Enter one letter: `3`

### **Output**:
```plaintext
Invalid input. Try again.
```

---
## **Technologies Used**
- **Language**: Kotlin
- **IDE**: IntelliJ IDEA (or other compatible IDEs)

## License
This project is licensed under the [MIT License](../../LICENSE).

## **Author**
Made with 💗 by Erin (GitHub: [@egwolk](https://github.com/ewgolk))  
