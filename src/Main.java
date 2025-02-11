import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello World");

        System.out.println(sb1.length());

        sb1.append("- This is StringBuilder");

        sb1.insert(11, "!");

        sb1.replace(0,5, "hi");

        String s = sb1.reverse().toString();

        System.out.println(sb1);

    }
}