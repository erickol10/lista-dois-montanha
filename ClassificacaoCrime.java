import java.util.Scanner;

public class ClassificacaoCrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Responda às perguntas abaixo (sim ou não):");
        
        System.out.print("Telefonou para a vítima? ");
        String pergunta1 = scanner.nextLine();
        
        System.out.print("Esteve no local do crime? ");
        String pergunta2 = scanner.nextLine();
        
        System.out.print("Mora perto da vítima? ");
        String pergunta3 = scanner.nextLine();
        
        System.out.print("Devia para a vítima? ");
        String pergunta4 = scanner.nextLine();
        
        System.out.print("Já trabalhou com a vítima? ");
        String pergunta5 = scanner.nextLine();
        
        int respostasPositivas = 0;
        
        if (pergunta1.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }
        
        if (pergunta2.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }
        
        if (pergunta3.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }
        
        if (pergunta4.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }
        
        if (pergunta5.equalsIgnoreCase("sim")) {
            respostasPositivas++;
        }
        
        if (respostasPositivas == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }
        
        scanner.close();
    }
}
