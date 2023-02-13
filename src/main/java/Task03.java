
//task03. Реализовать простой калькулятор

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите оператор -, +, *, /: ");
        String operation = scan1.nextLine();

        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        switch (operation){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
               break;
            default:
                System.out.println("такой операции нет");
        }
    }
}