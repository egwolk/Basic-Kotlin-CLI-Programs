# **Travel Package Selection Program**

## **Description**
This program allows users to choose from a variety of travel packages offered by Kotlin Travel Tours. It calculates the total cost based on the selected package and the number of guests. It also offers flexible payment options, including credit and installment plans for larger amounts.

## **Features**
- Lets users choose from three travel packages:
  - **Tour**: $1200.00 per guest
  - **Island Hopping**: $1500.00 per guest
  - **Ship Wrecks**: $1600.00 per guest
- Calculates the total cost dynamically based on the selected package and guest count.
- Offers payment via credit with optional installment plans (available for amounts above $4000).
- Ensures user-friendly input validation for names, package selection, and guest counts.
- Displays a detailed receipt and transaction summary.
- Includes console-clearing functionality for enhanced readability.

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
### **Case 1: Full Payment**
#### **Input**:
- Enter First Name: `John`
- Enter Last Name: `Doe`
- Choose your package: `b` (Island Hopping)
- Number of guests: `3`
- Would you like to pay via credit? `N`

#### **Output**:
```plaintext
Hello, John Doe!
Thank you for choosing Kotlin Travel Tours to partner up with you and your vacation endeavors!

Your total is: $4500.00

Thank you for transacting with us!
You have chosen to pay the full amount upfront in cash.
You have paid us $4500.00.
Have a safe and happy trip!
```

### **Case 2: Credit with Installment**
#### **Input**:
- Enter First Name: `Jane`
- Enter Last Name: `Smith`
- Choose your package: `c` (Ship Wrecks)
- Number of guests: `5`
- Would you like to pay via credit? `Y`
- Would you like to pay via installment within 6-months? `Y`
  
#### **Output**:
```plaintext
Hello, Jane Smith!
Thank you for choosing Kotlin Travel Tours to partner up with you and your vacation endeavors!

Your total is: $8000.00

Thank you for transacting with us!
You have chosen to pay via a 6-month installment plan.
You will be paying us $1333.33 every month.
Have a safe and happy trip!
```

### **Invalid Input Example**
#### **Input**:
- Enter First Name: ``

#### **Output**:
```plaintext
Error. Invalid Input.
```

---
## **Technologies Used**
- **Language**: Kotlin
- **IDE**: IntelliJ IDEA (or other compatible IDEs)

## License
This project is licensed under the [MIT License](../../LICENSE).

## **Author**
Made with 💗 by Erin (GitHub: [@egwolk](https://github.com/ewgolk))  
