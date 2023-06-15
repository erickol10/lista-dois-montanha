import java.util.Scanner;

public class VerificaSexo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma letra (F ou M): ");
        String letra = scanner.next().toUpperCase();
        
        if (letra.equals("F")) {
            System.out.println("F - Feminino");
        } else if (letra.equals("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
        
        scanner.close();
    }
}
