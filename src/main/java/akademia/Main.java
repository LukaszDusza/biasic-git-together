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

      System.out.println("Dajże nazwisko, ziom.");
      String input = scanner.next();
      System.out.println("Bry, " + input);
  }

  public static void lol(){
      System.out.println("xD");
  }
}
