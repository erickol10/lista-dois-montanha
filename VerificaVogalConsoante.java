import java.util.Scanner;

public class VerificaVogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = scanner.next().toLowerCase();

        if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) {
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("A letra digitada é uma vogal.");
            } else {
                System.out.println("A letra digitada é uma consoante.");
            }
        } else {
            System.out.println("Caractere inválido. Digite apenas uma letra.");
        }

        scanner.close();
    }
}
