package segundob.listas.lista5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class QRcode {
  public static void main(String[] args) {
    System.out.println(genQRCode(null, 20.00));
  }

  public static String genQRCode(String token, Double amount) {
    try {
      URL url = new URL("https://sandbox.openfinance.celcoin.dev/pix/v1/brcode/static");

      HttpURLConnection connection = (HttpURLConnection) url.openConnection();

      // Dados do json
      String json = "{\r\n" + //
          "  \"key\": \"testepix@celcoin.com.br\",\r\n" + //
          "  \"amount\": 10.55,\r\n" + //
          "  \"transactionIdentification\": \"testqrcodestaticcelcoin\",\r\n" + //
          "  \"merchant\": {\r\n" + //
          "    \"postalCode\": \"01201005\",\r\n" + //
          "    \"city\": \"Barueri\",\r\n" + //
          "    \"merchantCategoryCode\": 0,\r\n" + //
          "    \"name\": \"Celcoin\"\r\n" + //
          "  }\r\n" + //
          "}";

      connection.setRequestMethod("POST");
      connection.setRequestProperty("Content-Type", "application/json");
      connection.setRequestProperty("Authorization",
          "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiI5cVJtemhSMkNMZ1h1RXBzMU9neFcydW82WUpBK25uWVZOK3M1RGhBUzNmQ3ZQaU9lTnVGWGFQaTBPeDZ1cVlrV0tHc09OR3prTGJpZDVmM0Q4L3pmWHJoeUNxbXkwQTZ6YTl1Tm96MlZrVlpMZnUxcDA2WS92dUZhOVVFRGMxb0hXZ0xWcktFbjRPU05ONE9HTXNVSC9hSnRnT0dHOUpTZFRFMjFpTzVMTXBhajR5TjBvZjJCdXIreWJKVkwzcEV2TVB4RjBGZ1Z0Z2sxYU1MMmdqeXp1WjRMMjh3NXY1VlQ2RlJGdzZpRng2eTB1QzVBSUpiNG9KeUR5d1MwUHRkenNqcEs3T0lwbzRMTi9XdFV6Q0JqcndTWER4cFZZN1U4RW5kNzVTL1hLV3NHd2I0YUJaZ2ZVL3VNT2psN0VMUVQ5eWJJbFg3TFF3MVgzQVVqcDM3NWpyY0VOQmFFOWtzU2dsckg2M21odkFPdmpnWVliZmYvdlNMbUYvbjJ3TW1US0t1QzVjRHNiVkNzVlVNUWo2aitKeC9UdDdhWHBEMWxPdVhWdHFDRlovV2kxS3NuR040bzdQQVZxMTRacFpCajJXMy83TVA1Y1F3WFJZRWpLZGY3aTQ1OVMrditqRjJ5cGN2N2s1U0tFa09MNzM4WWtmcE51bCtQSzc5M2dzVzRrRWcrMTdZcHRLeVY0ZEV4WVlSRy9MN2lpL0p4NnZ3ZVpSUmFkVFgwWmM3aCtUYkN1eVpmeFlJNXplS0xqT0tpbjJ2YXFkVlNxbDdNVm5QQlFVL3p3PT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiYjUzODlmZTk3MTM5NGY3YjhhZjMiLCJleHAiOjE3MTkxODI2MzUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.9FeNFvBfZ4Y3d5XbCHHcImdW0d08i41wTjMzTDFJcYs");
      connection.setDoOutput(true);

      // Escrevendo JSON
      try (OutputStream os = connection.getOutputStream()) {
        byte[] input = json.getBytes(StandardCharsets.UTF_8);
        os.write(input, 0, input.length);
      }

      // Lendo retorno do JSON na request
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
