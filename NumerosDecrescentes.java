import java.util.Scanner;
import java.util.Arrays;

public class NumerosDecrescentes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        int[] numeros = {numero1, numero2, numero3};
        Arrays.sort(numeros);

        System.out.println("Números em ordem decrescente: " + numeros[2] + ", " + numeros[1] + ", " + numeros[0]);

        scanner.close();
    }
}
