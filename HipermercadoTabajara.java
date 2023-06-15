import java.util.Scanner;

public class HipermercadoTabajara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Hipermercado Tabajara!");
        System.out.println("Promoção de Carnes:");
        System.out.println("1. File Duplo");
        System.out.println("2. Alcatra");
        System.out.println("3. Picanha");
        System.out.print("Escolha o tipo de carne (1, 2 ou 3): ");
        int tipoCarne = scanner.nextInt();

        System.out.print("Digite a quantidade de carne (em Kg): ");
        double quantidadeCarne = scanner.nextDouble();

        double precoTotal = 0.0;

        switch (tipoCarne) {
            case 1:
                if (quantidadeCarne <= 5) {
                    precoTotal = quantidadeCarne * 4.90;
                } else {
                    precoTotal = quantidadeCarne * 5.80;
                }
                break;
            case 2:
                if (quantidadeCarne <= 5) {
                    precoTotal = quantidadeCarne * 5.90;
                } else {
                    precoTotal = quantidadeCarne * 6.80;
                }
                break;
            case 3:
                if (quantidadeCarne <= 5) {
                    precoTotal = quantidadeCarne * 6.90;
                } else {
                    precoTotal = quantidadeCarne * 7.80;
                }
                break;
            default:
                System.out.println("Tipo de carne inválido!");
                System.exit(0);
        }

        System.out.print("A compra será feita no cartão Tabajara? (S/N): ");
        char cartaoTabajara = scanner.next().charAt(0);

        double desconto = 0.0;

        if (cartaoTabajara == 'S' || cartaoTabajara == 's') {
            desconto = precoTotal * 0.05;
            precoTotal -= desconto;
        }

        System.out.println("Cupom Fiscal:");
        System.out.println("Tipo de carne: " + getDescricaoCarne(tipoCarne));
        System.out.println("Quantidade de carne: " + quantidadeCarne + " Kg");
        System.out.println("Preço total: R$" + precoTotal);
        System.out.println("Tipo de pagamento: " + (cartaoTabajara == 'S' || cartaoTabajara == 's' ? "Cartão Tabajara" : "Outro"));
        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Valor a pagar: R$" + precoTotal);

        scanner.close();
    }

    public static String getDescricaoCarne(int tipoCarne) {
        switch (tipoCarne) {
            case 1:
                return "File Duplo";
            case 2:
                return "Alcatra";
            case 3:
                return "Picanha";
            default:
                return "Desconhecido";
        }
    }
}
