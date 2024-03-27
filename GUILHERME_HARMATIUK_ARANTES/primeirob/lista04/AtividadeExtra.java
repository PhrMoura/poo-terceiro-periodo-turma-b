package primeirob.lista04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AtividadeExtra {
    public static void main (String[] args) {
        console();
    }

    public static void console() {
        int action = 0;
        Scanner action_input = new Scanner(System.in);
        
        List<Double> list = new ArrayList<Double>();


        while (action != 3) {
            System.out.println("");
            System.out.println("Selecione uma ação:");
            System.out.println("1 - Adicionar Venda");
            System.out.println("2 - Calcular Total");
            System.out.println("3 - Sair");

            action = action_input.nextInt();

            switch (action) {
                case 1:
                    adicionarVenda(list);
                    break;
                case 2:
                    System.out.println(calcularTotal(list));
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } 
    }

    public static double calcularTotal(List<Double> list) {
        double sum = 0;
        Iterator<Double> it = list.iterator();
        sum = list.stream()
            .collect(Collectors.summingDouble(Double::doubleValue))
        ;
        return sum;
    }

    public static List<Double> adicionarVenda(List<Double> list) {
        System.out.println("Quantidade de Plantas x Vendidas: ");
        Scanner qtdInput = new Scanner(System.in);
        int qtd = qtdInput.nextInt();

        System.out.println("Preço da Planta x que foi vendida: ");
        Scanner valueInput = new Scanner(System.in);
        float value = valueInput.nextFloat();

        if (qtd > 10) {
            double total = qtd * value;
            double desconto = ((qtd * value) * 0.05);
            System.err.println("total: " + total);
            System.err.println("desconto (5%): " + desconto);
            System.out.println("Valor Total com desconto: " + (total - desconto));
            
            list.add(total - desconto);
        } else {
            double total = qtd * value;
            System.out.println("Valor Total sem desconto: " + total);

            list.add(total);
        }
        return list;
    }
}
