package YAN_REULE.segundoB.prova;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Avaliacao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sistema de Consultas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JButton listagemDosAlunosBtn = new JButton("Listagem dos alunos");
        JButton registroTestemunhoBtn = new JButton("Criar registro de testemunho");
        JButton sairDoProgramaBtn = new JButton("Sair");

        listagemDosAlunosBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscaDadosAlunos buscaDados = new BuscaDadosAlunos();
                String jsonResponse = buscaDados.pegaJson("https://poo-exam.vercel.app/api/students");
                if (jsonResponse != null) {
                    JOptionPane.showMessageDialog(frame, jsonResponse, "Listagem alunos",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Falha ao buscar alunos", "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        registroTestemunhoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CriarRegistro criaRegistro = new CriarRegistro();
                String linkImg = JOptionPane.showInputDialog(frame, "Informe o link da imagem:");
                String descricao = JOptionPane.showInputDialog(frame, "Digite uma descrição:");
                String ra = JOptionPane.showInputDialog(frame, "Qual o RA:"); 
        
                criaRegistro.criarRegistro(linkImg, descricao, ra);
            }
        });
        
        sairDoProgramaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 
            }
        });

        panel.add(listagemDosAlunosBtn);
        panel.add(registroTestemunhoBtn);
        panel.add(sairDoProgramaBtn);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
