import java.util.Scanner;

public class DecomporNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro menor que 1000: ");
        int numero = scanner.nextInt();
        
        if (numero < 1000) {
            int centenas = numero / 100;
            int dezenas = (numero % 100) / 10;
            int unidades = numero % 10;
            
            String mensagem = "";
            
            if (centenas > 0) {
                mensagem += centenas + " centena" + (centenas > 1 ? "s" : "");
            }
            
            if (dezenas > 0) {
                if (!mensagem.isEmpty()) {
                    mensagem += ", ";
                }
                mensagem += dezenas + " dezena" + (dezenas > 1 ? "s" : "");
            }
            
            if (unidades > 0) {
                if (!mensagem.isEmpty()) {
                    mensagem += " e ";
                }
                mensagem += unidades + " unidade" + (unidades > 1 ? "s" : "");
            }
            
            System.out.println(mensagem);
        } else {
            System.out.println("Número inválido. Digite um número menor que 1000.");
        }
        
        scanner.close();
    }
}
