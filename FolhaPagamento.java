import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora de trabalho: R$ ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoIR = 0;
        double descontoINSS = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double totalDescontos;
        double salarioLiquido;

        if (salarioBruto <= 900) {
            descontoIR = 0;
        } else if (salarioBruto <= 1500) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIR = salarioBruto * 0.1;
        } else {
            descontoIR = salarioBruto * 0.2;
        }

        totalDescontos = descontoIR + descontoINSS;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR (" + calcularPercentual(descontoIR, salarioBruto) + "%): R$ " + descontoIR);
        System.out.println("(-) INSS (10%): R$ " + descontoINSS);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }

    public static double calcularPercentual(double valor, double total) {
        return (valor / total) * 100;
    }
}
