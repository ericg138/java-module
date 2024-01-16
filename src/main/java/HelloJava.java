import java.util.concurrent.ThreadLocalRandom;

public class HelloJava {
  private int i;

  private HelloJava() {

  }

  public void hello() {
    System.out.println("hello" + " java");

    String unused1 = "unused1";
    String unused2 = "unused2";
    
    String unused10 = "unused10";
  }

  private static ThreadLocalRandom random() {
    return ThreadLocalRandom.current();
  }
}
