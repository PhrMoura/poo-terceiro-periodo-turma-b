package poo.ListaSete;

import java.util.Date;
import java.util.ArrayList;

public class ProcessaPedido {
    Date dataAtual = new Date();
    Date dataVencimento;

    private void ProcessaPedido() {
        System.out.println("processando...");
    }

    private void ConfirmaPedido() {
        if (dataAtual.getTime() > dataVencimento.getTime()){
            System.out.println("Error");
        }
    }
}
