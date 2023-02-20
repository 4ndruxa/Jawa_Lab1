package Lab1OOP;

import java.util.Scanner;

public class Variant {
    public static void variant () {

        int c2_v = 2;
        int c3_v = 3;
        int c5_v = 5;
        int c7_v = 7;

        Scanner scan = new Scanner(System.in);
        System.out.print("Залікова книжка (2303): №");
        Integer nomer = scan.nextInt();

        int c2 = nomer % c2_v;
        int c3 = nomer % c3_v;
        int c5 = nomer % c5_v;
        int c7 = nomer % c7_v;

        System.out.println("\nМої дані для знаходження варіанту: ");
        System.out.println("C2 = " + c2 + ";\n" + "C3 = " + c3 + ";\n" + "C5 = " + c5 + ";\n" + "C7 = " + c7 + ".");
        System.out.println("\nОбчислення варіанту: ");
        String dod = "+ (додавання)";
        String vid = "- (віднімання)";
        String mnozh = "* (множення)";
        String dil = "/ (ділення)";
        String ostacha = "% (знаходження остачі від ділення)";

        if(c2 == 0) {
            System.out.println("У операції О1, мені потрібно виконати операцію: " + dod + ";");
        }
        else if(c2 == 1) {
            System.out.println("У операції О1, мені потрібно виконати операцію: " +  vid + ";");
        }
        else System.out.println("Error (((");

        System.out.println("Константа С = " + c3 + ";");

        if(c5 == 0) {
            System.out.println("У операції О2, мені потрібно виконати операцію: " + mnozh + ";");
        }
        else if(c5 == 1) {
            System.out.println("У операції О2, мені потрібно виконати операцію: " +  dil + ";");
        }
        else if (c5 == 2) {
            System.out.println("У операції О2, мені потрібно виконати операцію: " +  ostacha + ";");
        }
        else if (c5 == 3) {
            System.out.println("У операції О2, мені потрібно виконати операцію: " +  dod + ";");
        }
        else if (c5 == 4) {
            System.out.println("У операції О2, мені потрібно виконати операцію: " +  vid + ";");
        }
        else System.out.println("Error (((");

        if (c7 == 0){
            System.out.println("Для обчислення значення функції, мені потрібно використати тип данних: byte" + ".");
        }
        else if (c7 == 1) {
            System.out.println("Для обчислення значення функції, мені потрібно використати тип данних: short" + ".");
        }
        else if (c7 == 2) {
            System.out.println("Для обчислення значення функції, мені потрібно використати тип данних: int" + ".");
        }
        else if (c7 == 3) {
            System.out.println("Для обчислення значення функції, мені потрібно використати тип данних: long" + ".");
        }
        else if (c7 == 4) {
            System.out.println("Для обчислення значення функції, мені потрібно використати тип данних: char" + ".");
        }
        else if (c7 == 5) {
            System.out.println("Для обчислення значення функції, мені потрібно використати тип данних: float" + ".");
        }
        else if (c7 == 6) {
            System.out.println("Для обчислення значення функції, мені потрібно використати тип данних: double" + ".");
        }
    }
}

