package Lab1OOP;
public class Main {
    public static void main(String[] args) {
        //Представляюсь
        System.out.println("Лабораторна робота №1\nВиконав: студент групи ІО - 23\nБоднар Андрій");
        //Виклик методу Variant, котрий обчислює варіант
        Variant v = new Variant();
        v.variant();
        //Виклик методу Calculation
        Calculation calk = new Calculation();
        calk.calculator();
    }
}