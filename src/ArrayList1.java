//Escribe un programa que pida 10 números por teclado y que luego muestre los
//números introducidos junto con las palabras “máximo” y “mínimo” al lado del
//máximo y del mínimo respectivamente.
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Empieza a crear la lista de números:");

        numeros.add(20);
        numeros.add(10);
        numeros.add(30);
        numeros.add(89);
        numeros.add(43);
        numeros.add(36);
        numeros.add(26);
        numeros.add(12);
        numeros.add(79);
        numeros.add(16);
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