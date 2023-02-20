package Lab1OOP;

import java.util.Scanner;
public class Calculation {
    public static void calculator (){

        System.out.println("\nПриступимо до обчислення виразу:");

        Scanner scan1 = new Scanner(System.in);
        System.out.print("\nВведіть значення а: ");
        byte a = scan1.nextByte();
        System.out.print("Введіть значення b: ");
        byte b = scan1.nextByte();
        System.out.print("Введіть значення n: ");
        byte n = scan1.nextByte();
        System.out.print("Введіть значення m: ");
        byte m = scan1.nextByte();
        byte c = 2;

        double result = 0;

        for (byte i = a; i <= n; i++) {
            for (byte j = b; j <= m; j++) {
                if (i == 2){
                    System.out.println("Пропщено крок з діленням на 0;");
                }
                else {
                    result += (i + j) / (i - c);
                }
            }
        }
        System.out.println("\nРезультат обчислення: " + result);
    }
}
