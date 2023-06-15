import java.util.Scanner;

public class VerificaOperacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = scanner.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }

        System.out.println("O resultado da operação é: " + resultado);
        System.out.println("O número é:");

        if (resultado % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }

        if (resultado >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }

        if (resultado == Math.round(resultado)) {
            System.out.println("Inteiro");
        } else {
            System.out.println("Decimal");
        }

        scanner.close();
    }
}
