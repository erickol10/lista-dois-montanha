import java.util.Scanner;

public class SaudacaoTurnoEstudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Em que turno você estuda? Digite M para matutino, V para vespertino ou N para noturno: ");
        String turno = scanner.next().toUpperCase();
        
        String mensagem;
        
        if (turno.equals("M")) {
            mensagem = "Bom Dia!";
        } else if (turno.equals("V")) {
            mensagem = "Boa Tarde!";
        } else if (turno.equals("N")) {
            mensagem = "Boa Noite!";
        } else {
            mensagem = "Valor Inválido!";
        }
        
        System.out.println(mensagem);
        
        scanner.close();
    }
}
