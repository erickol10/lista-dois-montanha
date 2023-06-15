import java.util.Scanner;

public class VerificaData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = scanner.nextLine();
        
        // Verifica se a data está no formato correto
        if (data.matches("\\d{2}/\\d{2}/\\d{4}")) {
            int dia = Integer.parseInt(data.substring(0, 2));
            int mes = Integer.parseInt(data.substring(3, 5));
            int ano = Integer.parseInt(data.substring(6, 10));
            
            // Verifica se a data é válida
            if (validarData(dia, mes, ano)) {
                System.out.println("A data informada é válida.");
            } else {
                System.out.println("A data informada não é válida.");
            }
        } else {
            System.out.println("Formato de data inválido.");
        }
        
        scanner.close();
    }
    
    // Função para validar se uma data é válida
    public static boolean validarData(int dia, int mes, int ano) {
        if (ano < 0 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }
        
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        } else if (mes == 2) {
            if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        } else {
            return true;
        }
    }
}
