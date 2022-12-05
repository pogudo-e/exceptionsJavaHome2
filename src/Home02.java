public class Home02 {
    public static void main(String[] args) {

//        Если необходимо, исправьте данный код

        int d = 0;
        int[] intArray = {10,20,30,40,50,60,70,80,90};
        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}