package itstep.lesson5;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionsEx {

    public static void  someError() throws IOException {
        throw new IOException("Это просто тест");
    }

    public static void main(String[] args) {
        int a, b, c = 0;
        String str = null;
        Scanner scanner = new Scanner(System.in);

        try {
            someError();

            System.out.println("a = ");
            a = scanner.nextInt();
      /*  String str1 = scanner.next();
        a = Integer.parseInt(str1);//приводят строку к числовому значению*/

            System.out.println("b= ");
            b = scanner.nextInt();
            System.out.println("Введите символ = ");
            str = scanner.next();
            switch (str.charAt(0)) {
                case '+':
                    c = a + b;
                    break;
                case '-':
                    c = a - b;
                    break;
                case '*':
                    c = a * b;
                    break;
                case '/':
//               if (b == 0) {
//                   System.err.println("Делить на 0 нельзя!!!!!!!!");
//               }
                    c = a / b;
                default:
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        } catch (ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("Не дели на ноль пожалуйста!!!" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Файл не найден!");
        } finally {
            System.out.println("c = " + c);
            System.out.println("Приложение выполнено корректно");
        }

    }
}
