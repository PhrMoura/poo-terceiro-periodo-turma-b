package IGOR_FELIPE_MORETTO.segundob.prova;

import javax.swing.JOptionPane;

public class Main extends ListAlunos{
    public static void main(String[] args) {
         try {
            escolha();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "DEU ERRO PIAZÃO", 0);
        }
    }
    public static void escolha() {
        String[] operacoes = {"Listar Alunos", "Criar Novo Testemunho", "Sair"};
            int esc = JOptionPane.showOptionDialog(null, "Por favor, escolha a operação que deseja realizar", "Qual?", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);

           switch (esc) {
            case 0:
            JOptionPane.showMessageDialog(null, "A opção escolhida foi Listar Alunos", "Escolha", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "" + alunos(), "Alunos", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
            testemunho();
            break;
            case 2:
            JOptionPane.showMessageDialog(null, "A opção escolhida foi Sair", "Escolha", JOptionPane.INFORMATION_MESSAGE);
            default:
                break;
           }
    }
    }

