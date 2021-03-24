# Lab5
The main objective of this lab is to practice writing Junit test for your application. 

# Task 1
For this task you have to create aprocessor class first and then you have to write JUnit tests for each of the method in your class.
## Part 1:
For this repl, you're going to make a processor class that can work with the loop provided in main. Your processor will keep track of the sum of numbers passed in when the process() method is called, but only if its been turned _on_ first. When your processor is turned _off_ it should ignore all inputs.
The processor class is provided, but you must add the necessary instance variables and methods. The methods include:

- A **constructor** (which starts the processor being off)
- A process(int value) method which takes a value and adds that value to a running total, so long as the processor has been turned on.
- A getTotal() method which returns the current total.
- An on() method which turns the processor on.
- An off() method which turn the processor off.

Your processor class should work with the loop provided in main. All of your changes should go in the processor class.
A sample run of your processor could look like this (but note that this is tested automatically with unit tests):

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
## Part 2
Now create a meaningful test for each of the methods including the constructor for your processor class.
# Task 2
In this task you will gain experience reading the results of tests and using them to fix the code (that you didn't write yourself). For this task you are given a set of classes under the package *fixbytest*. You have been provided with all of the code, which compiles correctly. However some of the code does not work as intended. You will have to use the built in unit tests to guide you into fixing the code.

> Use the Run Tests, button which is accessible by clicking the arrow next to run, for each test that has failed, click on the the See More button to see the details of what when wrong and take a look at the associated method and compare the code to what the documentation (in the java doc comments) says should be happening.
