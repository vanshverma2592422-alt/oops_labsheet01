# OOPS Lab Sheet 01 - Java Solutions

This folder contains 20 separate Java programs. Each program has its own class and `main` method, so it can be compiled with the others and run independently.

## Object-Oriented Approach

Each question is represented by a class. The `main` method reads input when needed, creates an object of that question's class, and calls an instance method that performs the work. This keeps input/launch code separate from the operation and demonstrates classes, objects, fields, and methods.

## Solutions

1. **Name, age, and college** (`Question01NameAgeCollege.java`): Uses `String` variables for name and college and an `int` for age. Edit the example values at the top of the class, then call the object's display method.
2. **Arithmetic operations** (`Question02ArithmeticOperations.java`): Reads two integers and calculates addition, subtraction, multiplication, floating-point division, and remainder. Division and remainder by zero are reported as undefined.
3. **Even or odd** (`Question03EvenOdd.java`): Uses `number % 2` in an if-else statement.
4. **Relational operators** (`Question04RelationalOperators.java`): Prints the result of `==`, `!=`, `>`, `<`, `>=`, and `<=` for two integers.
5. **Explicit type casting** (`Question05ExplicitTypeCasting.java`): Reads a `double`, converts it to `int` with `(int)`, and prints both values. Casting discards the fractional part toward zero.
6. **Character code** (`Question06CharacterAscii.java`): Converts the entered Java `char` to an integer. For standard ASCII characters, this is the ASCII value; Java characters outside ASCII report their Unicode code unit value.
7. **Divisible by 3 and 5** (`Question07DivisibleByThreeAndFive.java`): Combines two remainder checks with the logical AND operator `&&`.
8. **Vowel or consonant** (`Question08VowelOrConsonant.java`): Converts the input to lowercase, checks the five English vowels, and rejects non-letter input.
9. **Marks and result** (`Question09MarksAndResult.java`): Adds three marks, calculates percentage out of 300, and passes only when every subject mark is at least 40 out of 100.
10. **Greatest of two** (`Question10GreatestOfTwo.java`): Uses if-else comparisons and reports when the numbers are equal.
11. **Largest of three** (`Question11LargestOfThree.java`): Uses nested if-else conditions to find the largest integer.
12. **Leap year** (`Question12LeapYear.java`): A year is a leap year when divisible by 400, or divisible by 4 but not by 100.
13. **Positive, negative, or zero** (`Question13PositiveNegativeZero.java`): Uses an if-else-if chain to classify an integer.
14. **Character classification** (`Question14CharacterClassification.java`): Uses `Character.isDigit`, `Character.isUpperCase`, and `Character.isLowerCase`; anything else is treated as a special character.
15. **Three-digit Armstrong number** (`Question15ArmstrongNumber.java`): Extracts each digit with `% 10`, sums the cubes, and compares the sum with the original three-digit number.
16. **Salary tax** (`Question16SalaryTax.java`): Selects a rate by the supplied income ranges and applies that rate to the full income. This follows the simple single-rate-per-range interpretation of the assignment, rather than progressive taxation.
17. **Integer palindrome** (`Question17IntegerPalindrome.java`): Reverses the digits using `%` and `/`, casts each extracted `long` digit to `int`, then compares the reversed value with the original. Negative values are not palindromes.
18. **Prime number** (`Question18PrimeNumber.java`): Tests divisors from 2 up to the square root (using integer division in the loop condition); values below 2 are not prime.
19. **Operator calculator** (`Question19OperatorCalculator.java`): Uses if-else to select `+`, `-`, `*`, or `/` for two numbers and prevents division by zero.
20. **Marriage eligibility** (`Question20MarriageEligibility.java`): Uses nested if-else conditions: male age must be at least 21 and female age at least 18. The gender input is case-insensitive.

## Compile and Run on Windows

Install a JDK (Java Development Kit), open PowerShell in this folder, and compile all source files into an `out` directory:

```powershell
javac -d out *.java
```

Run any one solution by its class name. For example:

```powershell
java -cp out Question01NameAgeCollege
java -cp out Question02ArithmeticOperations
```

Replace the class name with any of the 20 names shown in the solution list. Interactive programs prompt for their input in the terminal.