package testprocessor;
public class Processor {
  //processor
  private int total;
  private boolean on;
  
  public Processor() {
    on = false;
  }
  
  public void process(int newValue) {
    if (on) {
      total += newValue;
    }
  }
  
  public int getTotal() {
    return total;
  }
  
  
  public void on() {
    on = true;
  }
  
  public void off() {
    on = false;
  }
  
}