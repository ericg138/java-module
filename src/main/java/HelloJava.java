import java.util.concurrent.ThreadLocalRandom;

public class HelloJava {
  private int i;

  private HelloJava() {

  }

  public void hello() {
    System.out.println("hello" + " java");

    String unused1 = "unused1";
  } 

  private static ThreadLocalRandom random() {
    return ThreadLocalRandom.current();
  }
}
