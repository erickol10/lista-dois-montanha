import java.util.Scanner;

public class VerificaAnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if (ehBissexto(ano)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        scanner.close();
    }

    public static boolean ehBissexto(int ano) {
        if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)) {
            return true;
        }
        return false;
    }
}
