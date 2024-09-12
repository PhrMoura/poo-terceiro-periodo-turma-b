package segundob.listas.listaTres;

import javax.swing.JOptionPane;

public class Excecao extends Exception {

    public Excecao(String erro) {
        super(erro);
    }

    public void mensagemErro() {
        JOptionPane.showMessageDialog(null, getMessage(), "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
    }
}
