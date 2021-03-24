package testprocessor;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello Processor!");
    
    Processor p = new Processor();
    //promts the user
    System.out.println("Enter an integer value or enter 'on'/'off' to turn the processor on/off: ");
    Scanner s = new Scanner(System.in);
    while (s.hasNext()) {
      if(s.hasNextInt()) {
        p.process(s.nextInt());
      } else {
        String text = s.next();
        switch (text) {
          case "on": p.on(); break;
          case "off": p.off(); break;
        }
      }
      System.out.println("Total is " + p.getTotal());
    }
    
    
  }
}