# siemens-PSC
Siemens Programming Skills Challenge - Interview

Question 03
-----------
Question three is a question that asks for an algorithm that prints the counter value from one to a hundred. If the value is divisible by 3, then prints Foo instead of the value. If the iteration is divisible by 5, then prints Baa. If the iteration is divisible by 3 and 5 simultaneously, it prints FooBaa. And if the number is not divisible by 3 and 5, print the iteration number itself. Furthermore, this code must have the minimum amount of code lines and should be efficient.


Question 04
-----------
Consider a string containing lowercase characters from the Portuguese alphabet. You can perform two types of operations on this string:
1. `Concat` a lowercase character from the Portuguese alphabet at the end of the string.
2. `Remove` the last character from the string. If the string is empty, it will remain empty.

Given an integer `k` and two strings `s` and `t`, determine if you can convert `s` to `t` using exactly `k` operations described above on s. If possible, the program prints 'yes', otherwise it prints 'no'.

For example, string s = [a, b, c] and string t = [d, e, f]. The number of moves k = 6. To convert s to t, we first remove all characters using 3 moves. Then we concatenate each of the characters of t in the order. In the sixth move, you will have the expected string s. If more movements are available than necessary, they can be eliminated by performing multiple removals on an empty string. If there are fewer movements, it would not be possible to create the new string.

Develop a C/C++ or Java language program that implements and uses the `ConcatRemove(s, t, k)` function. It should return the results 'yes' or 'no'.

The function has the following parameters:
- *s: starting string*
- *t: desired string*
- *k: an integer that represents the number of operations*

Input format:
- *The first line contains the string s, the starting string.*
- *The second line contains the string t, the desired string.*
- *The third line contains an integer k, the number of operations.*

Constrains:
- *a) 1 <= | s | <= 100*
- *b) 1 <= | t | <= 100*
- *c) 1 <= k <= 100*
- *d) s and t consists of lowercase letters of the Portuguese alphabet, ascii [a-z]*

Output format:
Print 'yes' if you can get the string t by executing exactly k operations on the string s, and print 'no' otherwise.

Example 1:
- *blablablabla*
- *blablabcde*
- *8*
- *yes*

Explanation
It took 5 operations to reduce the string "blablablabla" to "blablab". Then, 3 concatenation operations (c, d, e) were needed to obtain the string "blablabcde".
In this way, as it was possible to convert s to t using exactly k = 8 operations, the program printed "yes".

Example 2:
- *tab*
- *tab*
- *7*
- *yes*

Explanation
It took 4 operations to reduce the string s (remember that a removal operation on an empty string, keeps the string empty). Then, 3 concatenation operations were performed (a, b, a). Since it was possible to convert s to t using exactly k = 7 operations.

Question 05
-----------
This question requires a unit test to be developed for the function concatRemove(s, t, k) developed in question 04. The unit test should be developed in C/C++ or Java language and should be able to test the function in different cenarios:

Like:
- (1) Input: `"abc"`, Desired: `"abcd"`, Movements: `1`, Result: `true`),
- (2) Input: `"abc"`, Desired: `"abcd"`, Movements: `0`, Result: `false`),
- (3) Input: `"abc"`, Desired: `"xyz"`, Movements: `6`, Result: `true`),
- (4) Input: `"abc"`, Desired: `"xyz"`, Movements: `5`, Result: `false`),
- (5) Input: `"blablablabla"`, Desired: `"blablabcde"`, Movements: `8`, Result: `true`),
- (6) Input: `"tab"`, Desired: `"tab"`, Movements: `7`, Result: `true`)

In these examples, the function should return `true` for the first, third, fifth and sixth cases (representing the result 'yes' in the question 04). And `false` for the second and fourth cases (representing the result 'no' in the question 04).

Question 06
-----------
Consider the following problem:

Two tables are provided: Students and Notes.

`Students` contains three columns: ID, Name and Value.

| Coluna        | Tipo          |
| ------------- | ------------- |
| ID            | Integer       |
| Name          | String        |
| Value         | Integer       |

The table `Notes` contains three Integers columns: Grade, Min_Value and Max_Value filled according example bellow:

| Grade         | Min_Value     | Max_Value     |
| ------------- | ------------- | ------------- |
| 1             |  0            | 9             |
| 2             | 10            | 19            |
| 3             | 20            | 29            |
| 4             | 30            | 39            |
| 5             | 40            | 49            |
| 6             | 50            | 59            |
| 7             | 60            | 69            |
| 8             | 70            | 79            |
| 9             | 80            | 89            |
| 10            | 90            | 100           |


Joana gives Eva the task of generating a report containing three columns: Name, Grade and Value. Joana does not want the names of students who received a grade lower than 8. The report must be in descending order by grade, that is, the highest grades are inserted first. If there are more than one student with the same grade (8-10) assigned to them, sort those students in particular by their names in alphabetical order. Finally, if the grade is less than 8, use "NULL" as the name and list them in grades in descending order. If there are more than one student with the same grade (1-7) assigned to them, sort those students in particular by their grades in ascending order.

Write an SQL query to help Eva.

Input example:
| ID            | Name          | Value         |
| ------------- | ------------- | ------------- |
| 1             | Julia         | 81            |
| 2             | Carol         | 68            |
| 3             | Maria         | 99            |
| 4             | Andreia       | 78            |
| 5             | Jaqueline     | 63            |
| 6             | Marcela       | 88            |

Output example:
- *Maria 10 99*
- *Julia 9 81*
- *Marcela 9 88*
- *Andreia 8 78*
- *NULL 7 63*
- *NULL 7 68*

*Note: Print "NULL" in the name if the grade is less than 8.*

*Note: Julia and Marcela have the same grade (9) and must be sorted alphabetically.
Not by Value (81 and 88).
This does not make sense because you are not ordering by value, but by grade and name.
But, I followed the documentation and the example.*


Explanation
Consider the following table with the grades assigned to students:

| Grade         | Min_Value     | Max_Value     | Grade         |
| ------------- | ------------- | ------------- | ------------- |
| 1             | Julia         | 81            | 9             |
| 2             | Carol         | 68            | 7             |
| 3             | Maria         | 99            | 10            |
| 4             | Andreia       | 78            | 8             |
| 5             | Jaqueline     | 63            | 7             |
| 6             | Marcela       | 88            | 9             |

Thus, the following students obtained grades 8, 9 or 10:
- *Mary (10)*
- *Julia (9)*
- *Marcela (9)*
- *Andreia (8)*


Question 07
-----------
An application has four classes: `A`, `B`, `C` and `D`. Classes `B` and `C` are subclasses of `A`. In classes `A`, `B` and `C` there are different attributes and a method called `checkBalance()` with the same signature but which performs operations that return values ​​of type double, however, different. Class `D` is the main class. Within the `main()` method of class `D`, the following instructions were typed:

(1) A* obj = new B(); <br>
double v = obj->checkBalance();

(2) A* obj1 = new C(); <br>
double v1 = obj1->checkBalance();

When these lines were executed, the variable `v` received the value 100.00 and the variable `v1` received the value 125.00. Note that both `obj` and `obj1` are type A objects, however, in addition to having different attributes, when calling the `checkBalance()` method through these objects, the return contained in variables `v` and `v1` was different. This shows an example of:

Possible answers:
- (a) Encapsulation
- (b) Method overload
- (c) Multiple inheritance
- (d) Generalization
- (e) Polymorphism

The correct answer is `(e) Polymorphism`. The reason is that the same method `checkBalance()` was called through objects of the same type, however, the return was different. This is because the method was overloaded in the subclasses `B` and `C` of the superclass `A`. So this is an example of polymorphism.
