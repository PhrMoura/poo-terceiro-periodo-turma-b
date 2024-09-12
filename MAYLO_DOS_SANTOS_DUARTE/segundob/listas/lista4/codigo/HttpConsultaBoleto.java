package segundob.listas.lista4.codigo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HttpConsultaBoleto {

     public static String getJsonBoleto(String number) {
            try {

                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/billpayments/authorize");

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                String json = "{\n" + //
                    "  \"barCode\": {\n" + //
                    "    \"type\": 0,\n" + //
                    "    \"digitable\":" + number + ",\n" + //
                    "  }\n" + //
                    "}";

                connection.setRequestMethod("POST");
                connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiIxNW1LRmg4VVc1K2licmxNV0VlRS9yajZNVU9lZWVydmVuTkhqb0NmVjM0Z3VRMlN4M3lRVGlYT1BsYmlZQ2JEM3l0QUgyamNEcjJwSEgzMUxKS0dXNzROdXlZUGRlQmZtMkNVUWI5R1IxYm56V1JBb1EwOGVJVFh3Qlc4VlIxSUZWQm85TlJWZWVzSTd2VktpeEJkNGFpMUtPdFBGRXhuOTl1ZDBWM09YL0d4SVA3SFZPaUNxbTMrelRnSmwzR0JDZzFGazBoQWI3cEtxaEJ4ZXZNQTVuWTJ5RWVDYllVSHVKd0U0NmNaUnlycUhldkoxQmxMM2JzU3FTbzVmN1dGN2RZUExSWXo5SFpwNC9rTFNoWmpseHF0RXJRSEF3WHViUmZhV0FaNWR1VDJ5M0Y5S0VjMWVYeXFqYWhSSEFvdDZpQVBpYTFlbGZ5NFhvQ1AzeG9SSjltU0tKZHo3bE1BV0RVUXRCN3FWQmtHTDZEV2R1WEdIR3d6MVhtUVR6Tk9PK2xidWlLdGpYV091SXQ1dmE1OVc4ZFVubFFldUJhU210R0htZjR0ZlRoOG1meFBIOTZzZUlVUCtXcGQ1djc0VjVMbGFvNHUwZDNVZGtxYVRIOGVheHl0ODhWQjZRTnVOdGZyaldSQkk3NUh6MHF1OEkya1oyaEk4dFlGUXNpTC9neFJxZXNFWjNVa3hEMXRHbmptN3o3Nm9ZSWttRlpZOEhES2VyRk9UaEZzUDVBSVlQTkFldVNwR3JyTWs4Y0ErVXh5TTk4RXJSanROcmZLMHZCVE9BPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiMzg3NTg2YjI3NzI2NDAwOWFiY2EiLCJleHAiOjE3MTkxNjU5MjIsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.F4NAVKi5G_Ajxxh7m2AtpozsCPjz-Sq8JhV66ZWcdos");
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
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
