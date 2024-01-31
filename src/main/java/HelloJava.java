import java.util.concurrent.ThreadLocalRandom;

public class HelloJava {
  private int i;

  private HelloJava() {

  }

  public void hello() {
    System.out.println("hello" + " java");

    String unused1 = "unused1";
    String unused2 = "unused2";
    String unused3 = "unused3";
    
    String unused2 = "unused10";
    String unused3 = "unused11";
    String unused3 = "unused12";
    
    String unused3 = "unused13";
    //blabla
  }

  private static ThreadLocalRandom random() {
    return ThreadLocalRandom.current();
  }
}
