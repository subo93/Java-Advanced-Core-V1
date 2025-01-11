package UserInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("===== BufferReader =====");

        System.out.println("Enter a number: ");
     //   int num = System.in.read();

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
       // bf.close();

        System.out.println("===== Scanner class =====");

        Scanner scanner = new Scanner(System.in);
        int num2 = scanner.nextInt();
        System.out.println(num2);

    }
}
