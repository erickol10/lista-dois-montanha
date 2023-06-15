import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero == Math.round(numero)) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }

        scanner.close();
    }
}
