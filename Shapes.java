import java.util.Random;

public class Shapes {
    public static void main(String[] args) {
      Turtle.setCanvasSize(500, 500);
      Turtle t = new Turtle(-100, 100);
    
      // Task 1: Draw a regular shape
      int numSides = 5;
      int sideLength = 70;
      for (int i = 0; i < numSides; i++) {
         t.forward(sideLength);
         t.right((double)(360 / numSides));
      }

      // Task 2: Draw a regular shape many times
      int numShapes = 10;
      sideLength = 50;
      t.up();
      t.setPosition(100, 100);
      t.down();
      for (int i = 0; i < numShapes; i++) {
         for (int j = 0; j < numSides; j++) {
            t.forward(sideLength);
            t.right((double)(360 / numSides));
         }
         t.right((double) 360 / numShapes);
      }

      // Task 3: How many times does Turtle turn!
      t.up();
      t.setPosition(-100, -100);
      t.down();
      int totalTurns = 0;
      for (int i = 0; i < numShapes; i++) {
         for (int j = 0; j < numSides; j++) {
            t.forward(sideLength);
            t.right((double)(360 / numSides));
            totalTurns++;
         }
         t.right((double) 360 / numShapes);
         totalTurns++;
      }
      System.out.println("The Great Sir Turtleot has turned " + totalTurns + " times!");

      // Extension 1: Random
      Random r = new Random();
      t.up();
      t.setPosition(100, -100);
      t.down();
      for (int i = 0; i < numShapes; i++) {
         sideLength = (int)(r.nextDouble()* 30) + 30;
         for (int j = 0; j < numSides; j++) {
            t.forward(sideLength);
            t.right((double)(360 / numSides));
         }
         t.right((double) 360 / numShapes);
      }
      

      // Extension 2: Triply Nested Loop
      t.clear();
      t.speed(3.0);
      for (int k  = 0; k < 100; k++) {
         t.up();
         t.setPosition(r.nextGaussian() * 50, r.nextGaussian() * 50);
         t.down();
         numSides = (int)(r.nextDouble() * 5) + 3;
         sideLength = (int)(r.nextDouble() * 80) + 20;
         for (int i = 0; i < numShapes; i++) {
            for (int j = 0; j < numSides; j++) {
               t.forward(sideLength);
               t.right((double)(360 / numSides));
            }
            t.right((double) 360 / numShapes);
         }
      }
      
      
    }
}
