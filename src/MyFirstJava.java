import java.sql.SQLOutput;
import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {
        System.out.println("My first Intellij");
        int sum =addNumbers(4,5);
        System.out.println("sum is " + sum);

    }

    private static void readAndPrint() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        anyMethod(s);
        anyMethod("test");
    }

    private static void anyMethod(String s) {
        System.out.println(s);
    }

    public static int addNumbers (int a, int b) {
        return a + b;
    }
}

