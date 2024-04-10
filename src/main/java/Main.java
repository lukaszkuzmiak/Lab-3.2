import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj długość boku :");
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < n + 1 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j < i + 1; j++) {
        if (i == 1 || i == n || j == 1 || j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < i + 1; j++) {
        if (i == 1 || i == n || j == 1 || j == i) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}