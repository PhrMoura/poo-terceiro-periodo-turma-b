package segundob.listas.lista4.codigo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpConvenios {

        public static String getJsonConvenio() {
            try {

                URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                connection.setRequestMethod("GET");
                connection.setRequestProperty("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiJVWTBRL3ZKK2NGTnI5a1kvdENJNVBZY3RYMWZBYVBMM0tKdXJ1NjliV3VSTE15c3FQQ0xUV1JqVXp6Z1gyWEJaQVVMSFJYRGZEaGFRc0lUR1MyL0hROC9DY2JzTDU2WngrZG0wN3RFU2l5eHllVUhpTlhrZkxTd3NKZWx4cGRZK1V6UkJRcHdiazFtYkN5L2RVSU5NYVZSbTMrRDVORWUrVUlveUU4dG5IMjY1elIyWFNNWFgzVjF3Z0V5Y0dDNXFreDZhclJINk01OUxkWGtsc2tMOEdUSkJDOE85UUxVdmN1bzYrNGVsUzFyY3pKTVNvY082V1RUYmZSZTMxY01lM1pGbXFobmpoaVN5b3pKWG1HaTdCeGtQNWlDNlFWUnMvWE9IN294RysrQU9YTVhQV2ZKNG1qdjlUbUtuRjViN3h1eEdkZGdHZVBHbGtWWGpIdGlNWDdOSm5VLzJZM0JZeWlSanVhOXNDc29wTE5sSEgzY0ViRlVsSjBTb0NWOE5LSGRiMCtiKzI2REQxZVVhTThtSjVJMGkwRFg2b0tFTkRwczNRVTkwMkNTY2pTK0NIdDQ0OXkxcW5INWhoM004OWoxOThQSEMzckJhS3FSUWxtOUI5OTZHdXBIcUdXdFR3aDJPYUlNd2l0S1Byd2tORUtpWnZlU0IrNGp4cWhhaXNlL21zdS9wdDhPUE96ZzFqc3Y3Q1o4MWZiWW5WUjc0SFRoaDlOU2RDR0tIakExY3dYQmpaRG9pV3hESmJhN3hIbC9QU3A3NFkvS0JGSEdDZlp0eU5RPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNzQxZjdkOWQyODQ2NDM0NTgxMmYiLCJleHAiOjE3MTkxNjYxNDUsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.CqKNoZrproeDCgg3BumD_53H2i5hMAEtvsZBhWk9W2c");

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
