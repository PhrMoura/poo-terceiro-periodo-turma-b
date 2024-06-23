package segundob.aulas.aulasete;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

public class HttpSample {

    public static void main(String[] args) {
        
        try {
            URL basicUrl = new URL("https://economia.awesomeapi.com.br/json/last/USD");
            HttpURLConnection connection = (HttpURLConnection) basicUrl.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();   
            String line;

            while ((line = reader.readLine())!= null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            JOptionPane.showMessageDialog(null, response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
