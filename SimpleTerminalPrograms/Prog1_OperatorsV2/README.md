# **Prog1_OperatorsV2 (Calculator Program: Version 2)**

## **Description**
This is an enhanced version of the first program. It allows the user to input two numbers and then choose a specific arithmetic operation to perform. The program computes and displays one of the following based on the user's choice:
- Sum
- Difference
- Product
- Quotient
- Remainder  

The program continues to run until the user decides to exit.

## **Features**
- Offers a menu for selecting the desired arithmetic operation.
- Handles invalid inputs gracefully, ensuring smooth user experience.
- Displays "UNDEFINED" for division and modulus operations when the divisor is zero.
- Includes functionality to clear the console for a cleaner user interaction.
- Supports both `.bat` and `.sh` files for cross-platform execution.

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
- First Number: `10`
- Second Number: `2`
- Operation: `/` (Division)

### **Output**:
```plaintext
10 / 2 = 5
```

## **Another Example**
- First Number: `10`
- Second Number: `0`
- Operation: `/` (Division)

  ### **Output**:
```plaintext
10 / 0 = UNDEFINED
```

---
## **Technologies Used**
- **Language**: Kotlin
- **IDE**: IntelliJ IDEA (or other compatible IDEs)

## License
This project is licensed under the [MIT License](../../LICENSE).

## **Author**
Made with 💗 by Erin (GitHub: [@egwolk](https://github.com/ewgolk))  
