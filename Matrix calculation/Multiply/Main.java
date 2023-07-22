/* Carpilma*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int i, j, k, m, n, p, q, toplama = 0;
    int matriks1[][] = new int[10][10];
    int matriks2[][] = new int[10][10];
    int sonucu[][] = new int[10][10];
    Scanner klavye = new Scanner(System.in);

    System.out.print("ilk matrisin satır sayısını girin: ");
    m = klavye.nextInt();
    System.out.print("ilk matrisin sutun sayısını girin: ");
    n = klavye.nextInt();

    System.out.print("ikinci matrisin satır sayısını girin:: ");
    p = klavye.nextInt();
    System.out.print("ikinci matrisin sutun sayısını girin: ");
    q = klavye.nextInt();

    if (n != p) {
      System.out.println("Carpilmaz maalesef\n");
    } else {
      System.out.println("Matriks a : ");
      for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
          matriks1[i][j] = klavye.nextInt();
        }
      }

      System.out.println("Matriks b: ");
      for (i = 0; i < p; i++) {
        for (j = 0; j < q; j++) {
          matriks2[i][j] = klavye.nextInt();
        }
      }

      for (i = 0; i < m; i++) {
        for (j = 0; j < q; j++) {
          for (k = 0; k < p; k++) {
            toplama = toplama + matriks1[i][k] * matriks2[k][j];
          }
          sonucu[i][j] = toplama;
          toplama = 0;
        }
      }

      System.out.println("Carpi sonucu : ");
      for (i = 0; i < m; i++) {
        for (j = 0; j < n; j++) {
          System.out.print(sonucu[i][j] + "\t");
        }
        System.out.println();
      }
    }
  }
}
