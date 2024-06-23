package segundob.listas.lista5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;

import javax.swing.JOptionPane;

public class AtividadeCinco {
  public static void main(String[] args) {
    List<String> opcoes = List.of("Listagem de convênios", "Consulta de boletos", "Sair");

    String escolha = (String) JOptionPane.showInputDialog(
        null,
        "Escolha uma opção !",
        "🙄😍🔥🚳🧨😥👇",
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes.toArray(),
        opcoes.toArray()[0]);

    switch (escolha) {
      // fazer um regex disso depois
      case "Listagem de convênios":
        JOptionPane.showMessageDialog(
            null,
            listagemDeConvenios().substring(0, 200),
            "Convênios (ate 200 caracteres)",
            JOptionPane.INFORMATION_MESSAGE);
        break;
      case "Consulta de boletos":
      JOptionPane.showMessageDialog(
        null,
        consultaDeBoleto(),
        "Boleto (de um jeito meio tripa)",
        JOptionPane.INFORMATION_MESSAGE);
        break;
      default:
        // eu sou um aluno gasoso !
        System.exit(0);
        break;
    }
  }

  public static String listagemDeConvenios() {
    try {
      URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

      HttpURLConnection connection = (HttpURLConnection) url.openConnection();

      connection.setRequestMethod("GET");
      connection.setRequestProperty("Authorization",
          "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJnc1FzOHVFcTBnWFpzZlJwdmhIYUZJQ3IvL1gwU2QyQ1FRQ296OHdrY3BnNEVMdjdmc1paRTdUOGExbG1pNmkrSUJWSVNWZUZlc0g4MnpnaVBDT0EwQWpzM3F5eFllQng2Ui9jdUp5MUZQaEZTYnBGSDdIT2Z3UjV3UkNsR3hYOHpseTVheVNGVE90eG1CaGt6SFUzYTZzQ1hJQzBRTGphVzlJNk8yNEdaMllGTDJLTlRhazMzNmlTdGtSV3U3MnJwNDQ0MlI4UVVzNHdOSC9IRFJqdktpWnk4c0lqZWo3U1ViZ096a2xtZFVvUDV6Z21CVlhBQ0IrbElYTndSUFo2RnBuRmxmcGlTQTRadWxlVzZMbXU0QlNqcWoySXRNRjhRbUc0dVVqZDRTek1UWU5XeEpoYmkzang0RisxMDdzcmVrWU9VRHQ0OTBZKy9zZHhuSTJkYk9ieUplQmxMbDUvNVpWUG5KSVVGTStMOVc0VGNYOGlPSDI0TFdKMlRWeUM3YWwrcWZ2TmpqRW5Cd0lGdmZaS2JBWGJLQ1lxTWlZQ1BGdC9LR2ZiWW9UdGlGR3BUWU81K1dncE4rZGQ4QWpZMkowWUg1cGg0Tkh0RUlCVlVrMk91Z0pLQWJvTzJiNzhQeTdmRGMySHFGeXNnMUlzRGZIQ29Ia1BLVjdlTGtMc0RuQ1EwR0h3QlFxK2tHNWNjM210TWlWMmFTekN6aFBQdGJYWWZZbWwvd3JPRlY3WVI2a0dEUjc1M3BTQkRFSmZtemVqdEEzQWpEb201THJiRjFkSi9nPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNmViZjVlMWI1NzViNDU1M2IyZDAiLCJleHAiOjE3MTkxODYxMDIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.p14PiI0CSFCHTFwxQiFqaTaTihVLO0bvLHoQBY1EfVc");

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

      return null;
    }
  }

  public static String consultaDeBoleto() {
    try {
      URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      String linhaDigitavel = JOptionPane.showInputDialog(
        null,
        "Coloque o código do boleto !",
        null,
        JOptionPane.QUESTION_MESSAGE);

      String json = "{\n" + //
          "  \"barCode\": {\n" + //
          "    \"type\": 0,\n" + //
          "    \"digitable\": \"" + linhaDigitavel + "\"\n" + //
          "  }\n" + //
          "}";

      connection.setRequestMethod("POST");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Authorization",
          "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJnc1FzOHVFcTBnWFpzZlJwdmhIYUZJQ3IvL1gwU2QyQ1FRQ296OHdrY3BnNEVMdjdmc1paRTdUOGExbG1pNmkrSUJWSVNWZUZlc0g4MnpnaVBDT0EwQWpzM3F5eFllQng2Ui9jdUp5MUZQaEZTYnBGSDdIT2Z3UjV3UkNsR3hYOHpseTVheVNGVE90eG1CaGt6SFUzYTZzQ1hJQzBRTGphVzlJNk8yNEdaMllGTDJLTlRhazMzNmlTdGtSV3U3MnJwNDQ0MlI4UVVzNHdOSC9IRFJqdktpWnk4c0lqZWo3U1ViZ096a2xtZFVvUDV6Z21CVlhBQ0IrbElYTndSUFo2RnBuRmxmcGlTQTRadWxlVzZMbXU0QlNqcWoySXRNRjhRbUc0dVVqZDRTek1UWU5XeEpoYmkzang0RisxMDdzcmVrWU9VRHQ0OTBZKy9zZHhuSTJkYk9ieUplQmxMbDUvNVpWUG5KSVVGTStMOVc0VGNYOGlPSDI0TFdKMlRWeUM3YWwrcWZ2TmpqRW5Cd0lGdmZaS2JBWGJLQ1lxTWlZQ1BGdC9LR2ZiWW9UdGlGR3BUWU81K1dncE4rZGQ4QWpZMkowWUg1cGg0Tkh0RUlCVlVrMk91Z0pLQWJvTzJiNzhQeTdmRGMySHFGeXNnMUlzRGZIQ29Ia1BLVjdlTGtMc0RuQ1EwR0h3QlFxK2tHNWNjM210TWlWMmFTekN6aFBQdGJYWWZZbWwvd3JPRlY3WVI2a0dEUjc1M3BTQkRFSmZtemVqdEEzQWpEb201THJiRjFkSi9nPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNmViZjVlMWI1NzViNDU1M2IyZDAiLCJleHAiOjE3MTkxODYxMDIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.p14PiI0CSFCHTFwxQiFqaTaTihVLO0bvLHoQBY1EfVc");
      connection.setDoOutput(true);

      try (OutputStream os = connection.getOutputStream()) {
        byte[] input = json.getBytes(StandardCharsets.UTF_8);
        os.write(input, 0, input.length);
      }

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

      return null;
    }
  }
}
