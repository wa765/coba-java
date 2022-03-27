import java.util.Scanner;

public class Tugas_3_Segitiga_Sama_Kaki {
  public static void main(String[] args) {
    // String inputUser = "b";
    Scanner inputUser = new Scanner(System.in.toString());
    // 
    if (inputUser.toString() == "a") {
      // Segitiga siku 
      int i, j, row = 6;
    for (i = 0; i < row; i++) {
      for (j = row - i; j > 1; j--) {
        System.out.print(" ");
      }
      for (j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    } 
    // 
    else if (inputUser.toString() == "b") {
      // segitiga sama kaki
      int i, j, row = 5;
      for (i = 0; i < row; i++) {
        for (j = 2 * (row - i); j >= 0; j--) {
          System.out.print(" ");
        }
        for (j = 0; j <= i; j++) {
          System.out.print("* ");
        }
        System.out.println();
      }
    }
  }

  

}
