# **Number to Words Converter**

## **Description**
This program converts positive whole numbers (0-9,999) into their word representations. Users can either input a specific number to convert or view all numbers from 0 to 9,999 along with their word equivalents. It also includes interactive options for navigating and exiting the program.

## **Features**
- Converts numbers from 0 to 9,999 into words.
- Handles validation for input to ensure only positive whole numbers in the specified range are accepted.
- Allows users to view individual number conversions or all numbers in the range.
- Includes console-clearing functionality for improved readability and user experience.

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
### **Case 1: Convert a Specific Number**
#### **Input**:
- Pick an option: `A`
- Enter a positive whole number from 0-9,999: `123`

#### **Output**:
```plaintext
123 is one hundred twenty-three.
```

### **Case 2: View All Numbers**
#### **Input**:
- Pick an option: `B`

#### **Output**:
```plaintext
0 is zero.
1 is one.
2 is two.
...
Press enter to continue...
```
(Note: Output will pause every 1,000 numbers for readability.)

### **Case 3: Exit the Program**
#### **Input**:
- Pick an option: `C`

#### **Output**:
```plaintext
Goodbye!
```

### **Invalid Input Example**
#### **Input**:
- Enter a positive whole number from 0-9,999: `-10`

#### **Output**:
```plaintext
Error: Number not in range.
```

---
## **Technologies Used**
- **Language**: Kotlin
- **IDE**: IntelliJ IDEA (or other compatible IDEs)

## License
This project is licensed under the [MIT License](../../LICENSE).

## **Author**
Made with 💗 by Erin (GitHub: [@egwolk](https://github.com/ewgolk))  
