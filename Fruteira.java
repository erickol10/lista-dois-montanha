import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de morangos (em Kg): ");
        double quantidadeMorangos = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de maçãs (em Kg): ");
        double quantidadeMacas = scanner.nextDouble();
        
        double precoMorangos = 0.0;
        double precoMacas = 0.0;
        
        if (quantidadeMorangos <= 5) {
            precoMorangos = quantidadeMorangos * 2.50;
        } else {
            precoMorangos = quantidadeMorangos * 2.20;
        }
        
        if (quantidadeMacas <= 5) {
            precoMacas = quantidadeMacas * 1.80;
        } else {
            precoMacas = quantidadeMacas * 1.50;
        }
        
        double valorTotal = precoMorangos + precoMacas;
        
        if ((quantidadeMorangos + quantidadeMacas > 8) || valorTotal > 25.00) {
            valorTotal *= 0.90; // Aplica desconto de 10%
        }
        
        System.out.println("Valor a ser pago: R$" + valorTotal);
        
        scanner.close();
    }
}
