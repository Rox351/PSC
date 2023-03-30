package aula06;

import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

        sc.close();
    }
}

