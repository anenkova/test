import java.io.IOException;
import java.util.Scanner;

public class testСalсulator {
    public static void main(String[] args) throws IOException {

        char sym; double answ = 0;


        Scanner in = new Scanner(System.in);

        System.out.print("Первое число: ");
        double num1 = in.nextDouble();

        System.out.print("Действие: ");
        sym = (char) System.in.read();

        System.out.print("Второе число: ");
        double num2 = in.nextDouble();




        switch (sym) {
            case '+': answ =    num1 + num2;
                break;
            case '-':
                answ = num1 - num2;
                break;
            case '*':
                answ = num1 * num2;
                break;
            case '/':
                answ = num1 / num2;
                break;
            default:
                System.out.println("Ooops");

        }
        System.out.println("Результат: " + answ);



    }

}
