package ENZO_ANTONIO_PRIMON.segundob.prova;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StudentsRequest {
    public static void Students(){
            try {
                String jsonStudents = StudentsConsulta.getJsonStudents();

            Pattern pattern = Pattern.compile("\"(\\w+)\":\"([^\"]+)\"");
            Matcher matcher = pattern.matcher(jsonStudents);

            Map<String, Object> jsonData = new HashMap<>();

            int students = 0;

            while (matcher.find()) {
                String key = matcher.group(1);
                String value = matcher.group(2);

                jsonData.put(key, value);

                students++;

                if (students == 15) {
                    break;
                }
            }

            StringBuilder msg = new StringBuilder();

            msg.append("Dados do aluno: ");
            msg.append("\nNome: " + jsonData.get("name"));
            msg.append("\nRa: " + jsonData.get("ra"));

            JFrame frame = new JFrame("Aluno");
            JOptionPane.showMessageDialog(frame, msg.toString(), "Aluno", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
