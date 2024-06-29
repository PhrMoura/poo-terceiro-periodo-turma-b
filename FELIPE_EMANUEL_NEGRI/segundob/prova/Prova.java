package FELIPE_EMANUEL_NEGRI.segundob.prova;

import java.util.List;
import javax.swing.JOptionPane;

public class Prova{
    
    public static void main(String[] args) {
        List<String> opcoes = List.of("Listagem de alunos", "Criar registro de testemunho", "Pinxar");

        String opcao = (String) JOptionPane.showInputDialog(null,
        "O que deseja fazer??",
        "ℳ",
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes.toArray(), opcoes.toArray()[0]);

        switch (opcao) {
            case "Listagem de alunos":                
                ListagemAlunos.listagemAlunos();                
                break;
            case "Criar registro de testemunho":
                RegistroTestemunho.criandoRegistro();
                break;
            case "Pinxar":
                System.exit(0);
            break;
            
            default:
                break;
        }

    }

}
