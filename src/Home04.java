import java.util.Scanner;

public class Home04 {
    public static void main(String[] args) {
//        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {
            if (s.isEmpty()){
                throw new IllegalArgumentException();
            }
            System.out.println(s);
        } catch (IllegalArgumentException e){
            System.out.println("Нельзя вводить пустые строки: " + e);
        }


    }
}
