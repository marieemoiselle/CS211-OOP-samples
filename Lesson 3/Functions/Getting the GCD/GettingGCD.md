# GCD via Recursion (Java)
by: **Ms. Fatima Marie P. Agdon, MSCS**

## 💡 Premise
The **greatest common factor** (GCF), also known as the greatest common divisor (GCD) or highest common factor (HCF), is **the largest whole number that can divide all the given numbers without leaving a remainder**. For instance, the GCF of 18, 30, and 42 is 6.

## 🔁 Use of Recursion
Recursion is a mechanism that a function calls itself to solve a smaller version of the same problem until it reaches a stopping point, called a **base case**.

### 🧮 Euclidean Algorithm via Recursion
1. **Notation**
    $\gcd(a, b) = \gcd(b, a \bmod b)$

2. **Pseudocode**
    ```
    FUNCTION computeGCD(a, b):
        IF b == 0:
            RETURN a
        ELSE
            RETURN computeGCD(b, a mod b)
    ```
3. **How this works?**
    <br/>If you are to obtain the GCD of two numbers, represented by `a` and `b`:
    - If `b == 0`, then the GCD is `a`, meaning the **base case** is reached.
    - Otherwise, the `computeGCD()` function is called again, swapping the numbers as `(b, a % b)`.
        - `a % b` pertains to the remainder when `a` is divided to `b`.
    - This process goes on, until the remainder becomes `0`.

4. **Recursive Tree**
```
computeGCD(48, 18)
   |
   |--> computeGCD(18, 48 % 18)
   |--> computeGCD(18, 12)
           |
           |--> computeGCD(12, 18 % 12)
           |--> computeGCD(12, 6)
                   |
                   |--> computeGCD(6, 12 % 6)
                   |--> computeGCD(6, 0)
                           |
                           |--> return 6 (base case)

```

5. **Trace Table**
<br/>Let `a = 48`, `b = 18`.

| Step | `a` | `b`  | `a % b` | Function Call                              | Return Value               |
|------|-----|------|---------|--------------------------------------------|----------------------------|
|  1   | 48  |  18  |   12    | `computeGCD(48, 18) -> computeGCD(18, 12)` | recursive call             |
|  2   | 18  |  12  |   6     | `computeGCD(18, 12) -> computeGCD(12, 6)`  | recursive call             |
|  3   | 12  |  6   |   0     | `computeGCD(12, 6) -> computeGCD(6, 0)`    | recursive call             |
|  4   | 6   |  0   |   0     | `computeGCD(6, 0) -> base case -> return 6`| `6` (base case reached)    |


## ☕ Code Snippet
```java
    public static int computeGCD(int a, int b) {
        // base case: if b is 0, then a is the GCD
        if (b == 0) {
            return a;
        }
        // recursive step: GCD(a, b) = GCD(b, a % b)
        return computeGCD(b, a % b);
    }
```

## 📖 References
1. [Greatest Common Factor - CalculatorSoup](https://www.calculatorsoup.com/calculators/math/gcf.php)
2. [Java Recursion - W3Schools](https://www.w3schools.com/java/java_recursion.asp)

