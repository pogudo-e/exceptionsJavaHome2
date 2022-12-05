import java.util.InputMismatchException;
import java.util.Scanner;

public class Home01 {


    public static void main(String[] args) {

//          Задание 1 реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//          и возвращает введенное значение.
//          Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
//          необходимо повторно запросить у пользователя ввод данных.

        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                Float num = input.nextFloat();

                System.out.println(
                        "The float number entered is " + num);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: floating point umber required)");
                input.nextLine();
            }
        }
        while (continueInput);
    }
}
