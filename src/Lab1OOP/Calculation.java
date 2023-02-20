package Lab1OOP;

import java.util.Scanner;
public class Calculation {
    public static void calculator (){
        //Саме обчислення виразу
        System.out.println("\nПриступимо до обчислення виразу:");
        //Можливість ввести будь які дані
        Scanner scan1 = new Scanner(System.in);
        System.out.print("\nВведіть значення а: ");
        byte a = scan1.nextByte();
        System.out.print("Введіть значення b: ");
        byte b = scan1.nextByte();
        System.out.print("Введіть значення n: ");
        byte n = scan1.nextByte();
        System.out.print("Введіть значення m: ");
        byte m = scan1.nextByte();
        //Константа С
        byte c = 2;

        double result = 0;
        //Алгоритм обчислення
        for (byte i = a; i <= n; i++) {
            for (byte j = b; j <= m; j++) {
                //Обходження варіантів у яких порушуюється ОДЗ
                if (i == 2){
                    System.out.println("Пропщено крок з діленням на 0;");
                }
                else {
                    //Вираз, який обчислюється
                    result += (i + j) / (i - c);
                }
            }
        }
        //Відповідь :з
        System.out.println("\nРезультат обчислення: " + result);
    }
}
/* P.S. Якщо змінити в 19 рядку значення змінної С, а в 31 - операції (в першій та другій дужці), то можна
експерементувати з варіантами, але не варто забувати про область допустимих значень у 26 рядку і типи данних (11-24 р.),
які треба теж в залежності від виразу змінити.
Дякую за увагу)
Слава Україні!
 */

