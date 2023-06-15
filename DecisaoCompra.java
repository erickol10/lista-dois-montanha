import java.util.Scanner;

public class DecisaoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do primeiro produto: ");
        double preco1 = scanner.nextDouble();
        
        System.out.print("Digite o preço do segundo produto: ");
        double preco2 = scanner.nextDouble();
        
        System.out.print("Digite o preço do terceiro produto: ");
        double preco3 = scanner.nextDouble();
        
        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Você deve comprar o segundo produto.");
        } else if (preco3 < preco1 && preco3 < preco2) {
            System.out.println("Você deve comprar o terceiro produto.");
        } else {
            System.out.println("Há produtos com preços iguais. Faça sua escolha.");
        }
        
        scanner.close();
    }
}
