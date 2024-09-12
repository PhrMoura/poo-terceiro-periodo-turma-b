package primeirob.lista02;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        /*
         * 3. Adicionar ao menu existente função 2 e aprimorar cálculo do valor a pagar com a função 1. 
         */
        boolean pathConfirmed = false;
        while (pathConfirmed == false) {
            System.out.println("==================");
            System.out.println("Escolha uma ação: ");
            System.out.println("- [1]: Calcular Preço Total ");
            System.out.println("- [2]: Calcular Troco ");
            System.out.println("- [3]: Salvar Vendas ");
            System.out.println("- [4]: Sair ");
            System.out.println("");
            Scanner action_input = new Scanner(System.in);
            String action = action_input.nextLine();
            // action_input.close();

            switch (action) {
                case "1":
                    pathConfirmed = true;
                    primeirob.lista02.Atividade01.main(args);
                    break;
                case "2":
                    pathConfirmed = true;
                    primeirob.lista01.Atividade02.main(args);;
                    break;
                case "3":
                    pathConfirmed = true;
                    primeirob.lista02.Atividade02.main(args);
                case "4":
                    pathConfirmed = true;
                    System.out.println("Saindo da aplicação...");
                    break;
                default:
                    pathConfirmed = false;
                    System.out.println("Ação inválida. Reiniciando aplicação...");
                    break;
            }
            System.out.println("");
            System.out.println("==================");

            
            action_input.close();
        }
    }
}
