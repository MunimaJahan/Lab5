# Lab5
The main objective of this lab is to practice writing Junit test for your application. 

# Task 1
For this task you have to create a processor class first and then you have to write JUnit tests for each of the method in your class.

You are going to make a processor class that can work with the loop provided in main. Your processor will keep track of the sum of numbers passed in when the process() method is called, but only if its been turned _on_ first. When your processor is turned _off_ it should ignore all inputs.
The processor class is provided, but you must add the necessary instance variables and methods. The methods include:

- A **constructor** (which starts the processor being off)
- A process(int value) method which takes a value and adds that value to a running total, so long as the processor has been turned on.
- A getTotal() method which returns the current total.
- An on() method which turns the processor on.
- An off() method which turn the processor off.

Your processor class should work with the loop provided in main. All of your changes should go in the processor class.
A sample run of your processor could look like this:
```
Hello Processor!
 on
Total is 0
 5
Total is 5
 off
Total is 5
 10
Total is 5
 on
Total is 5
 10
Total is 15
 off
Total is 15
 5
Total is 15
```
# Task 2
Now create a set of meaningful tests for each of the methods including the constructor for your processor class.
You should at least check the followings:
- The constructor creates the processor as off and reads the initial value correctly.
- The on() and off() method is working properly.
- The getTotal() method works and displays correct amount depending on whether the processor is on or off.
