package FELIPE_EMANUEL_NEGRI.segundob.prova;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

public class ListagemAlunos {
    
    public static String listaAlunos() {
       
        try {
            
            URL url = new URL("https://poo-exam.vercel.app/api/students");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            return response.toString();

        } catch (Exception e) {
            e.printStackTrace();
            throw new Erro("Algo deu errado ai dog smdd!!");
        }

    }
    
    public static String listagemAlunos() {
        JOptionPane.showMessageDialog(null,
            listaAlunos(),
            "Listagem dos alunos turma B",
            JOptionPane.INFORMATION_MESSAGE);

            return null;

    }
}
