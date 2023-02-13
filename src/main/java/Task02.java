
/**
 * task02
 * Вывести все простые числа от 1 до 1000
 */
import java.util.*;

public class Task02 {

    public static void main(String[] args) {
        System.out.print("Введите целое число до 1000: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 2; i < num; i++) {
            boolean check = true;
            int sqrt_num = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrt_num; j++) {
                if ((i % j) == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + ", ");
            }
        }
    }
}