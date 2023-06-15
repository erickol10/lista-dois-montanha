import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;
        String conceito;
        String situacao;

        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
            situacao = "APROVADO";
        } else if (media >= 7.5 && media < 9.0) {
            conceito = "B";
            situacao = "APROVADO";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
            situacao = "APROVADO";
        } else if (media >= 4.0 && media < 6.0) {
            conceito = "D";
            situacao = "REPROVADO";
        } else if (media >= 0.0 && media < 4.0) {
            conceito = "E";
            situacao = "REPROVADO";
        } else {
            conceito = "Valor inválido";
            situacao = "Valor inválido";
        }

        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}
