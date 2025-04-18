# **Prog4_Denominations (Money Denominations)**

## **Description**
This program calculates the denominations of a given amount of money in various currency values. It offers a user-friendly interface to input amounts and displays the breakdown of denominations along with their totals for validation.

## **Features**
- Accepts monetary amounts up to $9,999,999.
- Calculates denominations for standard currency values:
  - Bills: $100, $50, $20, $10, $5, $2, $1
  - Coins: ¢50, ¢25, ¢10, ¢5, ¢01
- Includes:
  - Input validation to prevent invalid or unrealistic entries.
  - Overloaded methods for formatting monetary values.
  - A restart option to process multiple entries.
  - Console-clearing functionality for improved readability.

## **How It Calculates Denominations**
1. **Denomination Selection**:  
   The program uses an array of predefined denominations, ordered from largest to smallest (e.g., `$100, $50, $20, $10, etc.`). This ensures that the highest denomination is processed first.

2. **Division and Remainder**:  
   For each denomination:
   - The program divides the entered amount by the denomination value to determine how many of those denominations are needed.
   - It calculates the remaining amount using the remainder of this division and moves on to the next denomination.

3. **Rounding**:  
   To avoid precision issues caused by floating-point numbers, the program rounds calculations to two decimal places.

4. **Validation**:  
   After processing all denominations, the program sums up the total calculated amount to confirm it matches the original input.

### **Example Calculation**
#### Input:
- Entered Amount: `$187.43`

#### Step-by-Step Process:
1. $100 → 1 x $100 = $100  
   Remaining: $87.43  
2. $50 → 1 x $50 = $50  
   Remaining: $37.43  
3. $20 → 1 x $20 = $20  
   Remaining: $17.43  
4. $10 → 1 x $10 = $10  
   Remaining: $7.43  
5. $5 → 1 x $5 = $5  
   Remaining: $2.43  
6. $2 → 1 x $2 = $2  
   Remaining: $0.43  
7. ¢50 → 0 x ¢50 = $0  
   Remaining: $0.43  
8. ¢25 → 1 x ¢25 = ¢25  
   Remaining: $0.18  
9. ¢10 → 1 x ¢10 = ¢10  
   Remaining: $0.08  
10. ¢05 → 1 x ¢05 = ¢05  
    Remaining: $0.03  
11. ¢01 → 3 x ¢01 = ¢03  

#### Validation:
`$100 + $50 + $20 + $10 + $5 + $2 + ¢25 + ¢10 + ¢05 + ¢03 = $187.43`

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
- Enter the amount of money you have: `$1234.56`

### **Output**:
```plaintext
You Entered: $1,234.56

Total denominations:
$1,000 * 1 = $1,000.00
$200 * 1 = $200.00
$30 * 1 = $30.00
$4.56 * 1 = $4.56
Validation:
$1,000.00 + $200.00 + $30.00 + $4.56 = $1,234.56
```

## **Case: Restart Prompt**
### **Input**:
- Do you want to start again? [Y] Yes | [N] No: `N`

### **Output**:
```plaintext
Bye-bye!
```

## **Invalid Input Example**
### **Input**:
- Enter the amount of money you have: `-100`

### **Output**:
```plaintext
Wowza, you're extremely poor! Unfortunately you cannot get denominations if you have 0 to negative amounts of money :[
```

---
## **Technologies Used**
- **Language**: Kotlin
- **IDE**: IntelliJ IDEA (or other compatible IDEs)

## License
This project is licensed under the [MIT License](../../LICENSE).

## **Author**
Made with 💗 by Erin (GitHub: [@egwolk](https://github.com/ewgolk))  
