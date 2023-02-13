
//**task01
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)*/

import java.util.*;
public class Task01 {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();

        int num = 1;
        int fact = 1;

        for (int i = 2; i <= j; i++) {
            num = num + i;
            fact = fact * i;
        }

        System.out.println("n-ое треугольного число = " + num);
        System.out.println("факториал = " + fact);
    }
}

