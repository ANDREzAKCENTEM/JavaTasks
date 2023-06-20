// 1) Вычислить суммy чисел от 1 до n

import java.util.Scanner;

public class Task1 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Введите число n: ");

      int n = input.nextInt();
      int sum = 0;

      for (int i = 1; i <= n; i++) {
         sum += i;
      }
      System.out.println("Сумма от 1 до " + n + " равна " + sum);
   }
}