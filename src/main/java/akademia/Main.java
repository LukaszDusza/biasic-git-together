package akademia;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    Scanner scanner = new Scanner(System.in);
    System.out.println("jak masz na imię?");
    String sc = scanner.nextLine();
    System.out.println("Cześć " + sc);
    System.out.println("koniec");
  }
}
