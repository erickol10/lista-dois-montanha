import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de litros vendidos: ");
        int litros = scanner.nextInt();
        
        System.out.print("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);
        
        double precoGasolina = 2.50;
        double precoAlcool = 1.90;
        
        double valorAPagar = 0.0;
        
        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                valorAPagar = litros * (precoAlcool - (precoAlcool * 0.03));
            } else {
                valorAPagar = litros * (precoAlcool - (precoAlcool * 0.05));
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                valorAPagar = litros * (precoGasolina - (precoGasolina * 0.04));
            } else {
                valorAPagar = litros * (precoGasolina - (precoGasolina * 0.06));
            }
        } else {
            System.out.println("Tipo de combustível inválido!");
            System.exit(0);
        }
        
        System.out.println("Valor a ser pago: R$" + valorAPagar);
        
        scanner.close();
    }
}
