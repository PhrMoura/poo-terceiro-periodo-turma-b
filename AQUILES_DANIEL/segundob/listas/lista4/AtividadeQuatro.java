package segundob.listas.lista4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.JOptionPane;

public class AtividadeQuatro {
  public static void main(String[] args) {
    
    try {
      URL url = new URL("https://economia.awesomeapi.com.br/json/last/USD-BRL");
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

      JOptionPane.showMessageDialog(null,
      response.toString(),
      "USD-BRL",
      JOptionPane.INFORMATION_MESSAGE);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
