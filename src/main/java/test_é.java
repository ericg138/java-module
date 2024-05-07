import java.util.concurrent.ThreadLocalRandom;

public class test_é {
  private int i;

  private test_é() {

  }

  public void hello() {
    System.out.println("hello" + " java");

    String unused1 = "unused1";
    String unused2 = "unused2";
    String unused3 = "unused3";
  }

  private static ThreadLocalRandom random() {
    return ThreadLocalRandom.current();
  }
}
