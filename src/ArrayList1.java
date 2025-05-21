//Escribe un programa que pida 10 números por teclado y que luego muestre los
//números introducidos junto con las palabras “máximo” y “mínimo” al lado del
//máximo y del mínimo respectivamente.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();

        // Generate 10 random numbers between 0 and 100
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(101)); // 101 is exclusive upper bound
        }
        int maximo = Collections.max(numeros);
        int minimo = Collections.min(numeros);

        System.out.println("\nNúmeros introducidos:");
        for (int numero : numeros) {
            if (numero == maximo) {
                System.out.println(numero + " (máximo)");
            } else if (numero == minimo) {
                System.out.println(numero + " (mínimo)");
            } else {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}

/*
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        */