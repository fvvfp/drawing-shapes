
# DEBUGGING

## Task 1:
   - Set formula for turn angle to 180 - 360/numSides (this is for the interior angle, not exterior angle). 
   - Corrected it to 360/numSides.
   
## Task 2: 
   - Used setPosition without lifting the "turtle's tail," resulting in a line from the Task 1 shape to the Task 2 shapes
   - Added t.up() before setPosition and t.down() after

## Task 3:
   - Printed "times!" directly after totalTurns, resulted in the string "...turned 60times!"
   - Added a space before "times!" (" times!")

## Extension 2 (Triply Nested Loop)
   - Tried to use the non-static method "clear" with Turtle.clear
   - Changed to t.clear()
   
   - tried to add (random double) * int + int (adding a double to an int, error)
   - caseted (random double) * int to an int before adding





















# Specification

## 📖 Learning Objectives

In this assignment, you will demonstrate your ability to:

-   Write a `for` loop

-   Write a nested `for` loop

-   Call a library method

-   Read the documentation of a Java library to figure out how to call a formerly unknown method

-   Observe and document your personal debugging process

## ✍️ Before You Begin

Here are a few things to note before you begin writing your program:

### 🐛 Debugging

In the Reflection section of this assignment, you will be asked to reflect on your debugging process.

**<ins>Take Notes About Your Debugging Process</ins>**

As you work on C1, take notes about the error messages and bugs you encounter, as well as your debugging process. This means you should be noting the tools and strategies you use to understand the errors, debug, and fix your code.

Here is what you should record in your notes:

-   Record at least one time when your program\'s behavior differed from what you wanted it to do.

    -   What are the differences between the actual and desired behavior?

    -   What is your process for figuring out the problem with your code?

    -   What is the solution to this bug? That is, what do you need to fix about your code to make it have the desired behavior?

-   Record at least one time when your program didn\'t compile.

    -   What compilation errors did you get?

    -   What is your process for figuring out the problem with your code? Describe the resources or strategies you used in this process.

    -   What is the solution to the bug? That is, what do you need to fix about your code to make it compile?

You do not need to turn in all of your debugging notes, but you will need to answer questions about your debugging process in your Reflection.

Create a README.md in your repository which includes your debugging notes

**<ins>Debugging Resources</ins>**

Here are some course resources on debugging that you\'ve seen already:

-   Several slides on debugging and interpreting error messages from Creative Project 0.

-   Debugging practice from Section 3.

As you work on this assignment, look back at these resources as needed.

## Task 1 - Draw a Regular Shape

Your first task for this assignment is to draw a **regular shape** (a shape that has the same edge length and angle size for all of its edges and angles)!

-   Write one for loop to draw a shape from the table below. **<ins>Do not choose a shape that is crossed off in the table as those were covered in previous exercises.</ins>**

    -   Each iteration of the loop should draw one edge and vertex of the shape.

-   Below is a table listing the angles that the `Turtle` would have to turn at each vertex to draw some common regular shapes.

    -   We recommend you choose one of the shapes in the table below. If you choose to draw your own shape instead, it must be a regular shape.

> ![A table with numbers and text Description automatically generated](./media/image1.png)

-   Write your code for this task in the `main` method of `Shapes.java` beneath the comment that says `// Task 1: Draw a regular shape`

## Task 2 - Draw a Regular Shape Many Times

> Before you get started, make sure to **<ins>move your Turtle to another part of the canvas</ins>** so your drawings do not overlap!

The second task for this assignment is to draw your regular shape many times!

-   Using nested loops, draw your regular shape from Task 1 **at least 10 times** on the canvas.

    -   Each iteration of the inner loop should draw one edge and vertex of your shape.

    -   Each iteration of the outer loop should draw a whole shape once.

    -   Each iteration of the outer loop should add noticeable complexity to your drawing. That is, don\'t trace over exactly the same lines so that one iteration hides the work of a previous one. Your shapes can touch or overlap partially, and you can choose how to separate them (angle, position, size, etc\...)

-   Write your code for this task in the `main` method of` Shapes.java` beneath the comment that says `// Task 2: Draw a regular shape many times`

    -   Before your Task 2 code, make sure to move the Turtle to a different part of the canvas so that the drawing from Task 2 does not overlap with the drawing from Task 1.

> Make sure you don\'t create another Turtle just for this task - use your Turtle from Task 1! Additionally, please stick to the Turtle methods we have **covered in lecture and section!** In particular, you should **not** be using the `.shape()` method.

## Task 3 - How Many Times Does Turtle Turn!

> Before you get started, make sure to **<ins>move your Turtle to another part of the canvas</ins>** so your drawings do not overlap!

For our third task, we want to count how many times our Turtle turned!

-   Beneath the comment that says `// Task 3: How many times does Turtle turn!`, start by copying and pasting your code from Task 2, where you drew a regular shape multiple times.

    -   Before your Task 3 code, make sure to move the Turtle to a different part of the canvas so that the drawing from Task 3 does not overlap with the drawing from Task 2.

-   As your Turtle draws the shape, keep track of each turn. You\'ll calculate the <ins>cumulative sum</ins> of these turns.

    -   A cumulative sum is the total of all previous values up to the current point. For instance, if the Turtle draws a pentagon (which has 5 turns in each iteration) 10 times, the cumulative sum or in other words the total number of turns is 5×10=50.

    -   Think about where to **<ins>initialize your variable</ins>** so that we keep track of all the turns Turtle makes.

-   After completing the drawing, print out `"<yourTurtleName> has turned <totalTurns> times!"`.

    -   `<yourTurtleName>` is the name of your Turtle and `<totalTurns>` is how many total times your Turtle has turned (such as 50 from the example above). When you print out the total number of times your Turtle has turned, you should print it using your variable that was keeping track of the number of turns.

    -   **<ins>Do not</ins>** print out the value directly such as printing out \"50\"! Instead, you should print it out with your variable that is storing the total number of times your Turtle has turned.

## Extension - More Shapes!

> Before you get started, make sure to **<ins>move your Turtle to another part of the canvas</ins>** so your drawings do not overlap!

You must complete at least two extensions to earn a grade of E on this project.

See the [Creative Project Rubric](https://courses.cs.washington.edu/courses/cse121/24wi/rubrics/#creative-project-rubric) for details.

Instructions

-   Choose **<ins>at least two extension</ins>** from the 3 options below.

-   Write your code for your extension in the `main` method of `Shapes.java` beneath the comment that says `// Extension 1:` and `// Extension 2:`.

    -   Make sure to add the name of your chosen extension to that comment, for example: `// Extension 1: Triply Nested Loop` .

-   You may write code for additional optional extensions in the `main` method of `Shapes.java`. Be sure to add a descriptive comment above the code for each optional extension so it\'s easy to see where that extension\'s code begins.

-   Before the code for each extension, make sure to move the Turtle to a different part of the canvas so that the drawings do not overlap with the drawings from earlier tasks.

> Make sure you don\'t create more Turtles for the Extension - use your Turtle from Task 1!

### <ins>Option 1 - Additional Use of Loop Variable</ins>

In each iteration of a loop, use the loop variable (or some value computed from the loop variable) to determine some attribute of what is drawn in that iteration.

Here are some ideas for values that you might compute based on the loop variable. You can choose your own idea if you\'d like, but just make sure that the result of the computation can be seen in the resultant drawing.

-   The distance to move forward

-   The coordinates of the location to move to

-   The number of iterations for an inner loop

Click Expand to see examples:
<details>
  <summary>Expand</summary>

Additional use of loop variable to change the size of each star:

![a spiral pattern generated by overlaying many five-point stars over each other, gradually changing the offset and size](./media/image2.png)

Additional use of loop variable to change the location of each square:

![a parallelogram made out of rows of squares; each row is shifted by one square, creating the final shape](./media/image3.png)

</details>
<br />

### <ins>Option 2 - Random</ins>

In each iteration of a loop, generate a random number, and use it to determine some attribute of what is drawn in that iteration. Here are some examples of how you could incorporate the random number:

-   Draw a shape multiple times in random locations

-   Draw a shape multiple times, each with random sizes

Here are some resources to help you with generating random numbers:

-   Pre-class work on nested for loops and Random

-   Java library documentation for the [java.util.Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html) class

Click Expand to see examples:
<details>
  <summary>Expand</summary>

Randomly-sized hexagons:

![10 regular hexagons of random sizes](./media/image4.png)

Randomly-sized stars:

![five five-point stars of random sizes](./media/image5.png)

Randomly-placed squares:

![](./media/image6.png)

</details>
<br />

### <ins>Option 3 - Triply Nested Loop</ins>

Use a triply nested for loop to add even more complexity to your drawing, rather than just with a doubly nested loop. All loops **must** have at least one Turtle statement/action in its body.

Click Expand to see examples:
<details>
  <summary>Expand</summary>

Multiple circles of hexagons:

![four overlapping concentric pairs of circles, each generated by rotating many smaller hexagons with a fixed offset](./media/image7.jpeg)

A circle of circles of stars:

![six circles comprised of tiny stars, arranged in a larger regular hexagon/circle](./media/image8.png)

</details>
<br />