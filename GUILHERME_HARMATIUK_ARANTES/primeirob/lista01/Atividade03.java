package primeirob.lista01;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        System.out.println();
        /*
         * 3. Criar Menu Console:
            - [1] - Calcular Preço Total
            - [2] - Calcular Troco    
            - [3] - Sair    
         */
        boolean pathConfirmed = false;
        while (pathConfirmed == false) {
            System.out.println("==================");
            System.out.println("Escolha uma ação: ");
            System.out.println("- [1]: Calcular Preço Total ");
            System.out.println("- [2]: Calcular Troco ");
            System.out.println("- [3]: Sair ");
            System.out.println("");
            Scanner action_input = new Scanner(System.in);
            String action = action_input.nextLine();
            // action_input.close();

            switch (action) {
                case "1":
                    pathConfirmed = true;
                    calcularPrecoTotal();
                    break;
                case "2":
                    pathConfirmed = true;
                    calcularTroco();
                    break;
                case "3":
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
    static void calcularPrecoTotal () {
        System.out.println("Aplicação 'Calculadora de Preço Total' Selecionada ");
        System.out.println("Quantidade de Plantas x Vendidas: ");
        Scanner qtd_input = new Scanner(System.in);
        int qtd = qtd_input.nextInt();
        // qtd_input.close();
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Preço de cada Planta x: ");
        Scanner valor_input = new Scanner(System.in);
        float valor = valor_input.nextFloat();
        // valor_input.close();
        float total = qtd * valor;
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Valor Total (qtd de plantas vendidas * preço da planta): " + total);
        
        qtd_input.close();
        valor_input.close();
    }
    static void calcularTroco () {
        System.out.println("Aplicação 'Calculadora de Troco' Selecionada ");
        System.out.println("Valor total da compra: ");
        Scanner total_input = new Scanner(System.in);
        float total = total_input.nextFloat();

        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Valor pago pelo cliente: ");
        Scanner valor_pago_input = new Scanner(System.in);
        float valor_pago = valor_pago_input.nextFloat();
        
        float resultado = total - valor_pago;
        if (resultado < 0) {
            System.out.println("O cliente precisa de troco de: " + (resultado * -1) + " reais");
        } else if (resultado == 0) {
            System.out.println("O cliente não precisa de ou deve troco. Ele pagou a quantia exata");
        } else if (resultado > 0) {
            System.out.println("O cliente ainda deve: " + (resultado) + " reais");
        }
        System.out.println
        ("~~~~~~~~~~~~~~~~~~~~");

        total_input.close();
        valor_pago_input.close();

    }
}
