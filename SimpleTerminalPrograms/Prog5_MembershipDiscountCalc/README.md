# **Prog5_MembershipDiscountCalc (Supermarket Checkout Program)**

## **Description**
This program simulates a supermarket checkout system. It calculates the user's final purchase total based on the input amount and applies discounts if applicable:
- If the purchase total exceeds $1000:
  - Members get a 10% discount.
  - Non-members get a 5% discount.
- If the purchase total is $1000 or less, no discount is applied.
- If the purchase total is zero or negative, the program notifies the user that the amount is invalid.

## **Features**
- Handles user input validation for purchase amounts and membership status.
- Applies discounts dynamically based on user input.
- Ensures accurate calculation and formatting of monetary values.
- Includes functionality to clear the console for smoother user experience.

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
### **Case 1: Purchase Total Greater Than $1000, Member**
#### **Input**:
- Enter your purchase total: `1500`
- Are you a member? `Y`

#### **Output**:
```plaintext
Congrats! You got a 10% discount as a member.
$150.00 has been deducted from your initial purchase total of: $1500.00.
Your new purchase total is: $1350.00.
```

### **Case 2: Purchase Total Greater Than $1000, Non-member**
#### **Input**:
- Enter your purchase total: `1200`
- Are you a member? `N`

#### **Output**:
```plaintext
Congrats! You got a 5% discount as a non-member.
$60.00 has been deducted from your initial purchase total of: $1200.00.
Your new purchase total is: $1140.00.
```

### **Case 3: Purchase Total $1000 or Less**
#### **Input**:
- Enter your purchase total: `800`

#### **Output**:
```plaintext
Sorry, your purchase total of $800.00 is not legible for a discount.
```

### **Case 4: Invalid Purchase Total**
#### **Input**:
- Enter your purchase total: `-100`

#### **Output**:
```plaintext
$-100.00 is not a possible amount.
```

---
## **Technologies Used**
- **Language**: Kotlin
- **IDE**: IntelliJ IDEA (or other compatible IDEs)

## License
This project is licensed under the [MIT License](../../LICENSE).

## **Author**
Made with 💗 by Erin (GitHub: [@egwolk](https://github.com/ewgolk))  
