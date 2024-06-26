package segundob.listas.listaquatro.codigo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class ConvenioConsulta {

     public static String getJsonConvenio() {
        try {
            URL url = new URL("https://sandbox.openfinance.celcoin.dev/v5/transactions/institutions");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();


            // Dados da Headers da nossa request & configs
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization",
                    "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjbGllbnRfaWQiOiI0MWI0NGFiOWE1NjQ0MC50ZXN0ZS5jZWxjb2luYXBpLnY1IiwiaHR0cDovL3NjaGVtYXMueG1sc29hcC5vcmcvd3MvMjAwNS8wNS9pZGVudGl0eS9jbGFpbXMvbmFtZSI6InRlc3RlIiwidGVuYW50X3VzZXIiOiI2RWhRSW80djdmVkZ1dzlqamdFdjlaNnVrSHlaV0lXZ2h6VDVaUnM3MTkySDQ2YWtNSmNuNUNuS24vZGt2Z2RHd0NkRXdtRGlDOERFQkp3RVBCZFVQZzI4ZXppVGh4NnFNSkNHT0p5cFZTblFPV2twVlk3SWt4c0l5cnZWbzVuaWVNeHhmYlVrY1hyaGxNS1lmaHRNNVB5SG1WWnJkSndQdmRTd3U3SS9zeVZhOUY1dGp2L2ZsbUFxT3NndWlGUGpYaUNkK1d6b0p4MlpRcHRuUHRxWVhzMTJWU2Q1Zy9WYUNWcm9RelN1cHBDTXhFTGZTOW5mK2hQMHZsdGNrVWtiMmZ3L2Rqd2ZqOHJHVHM5QVZpcDhlK1k2aGxCeVh4aGxFUkNpaURndkkrdEJoYk1RRUg3azd5am1WeEx6dVUvdFNtVkcwcUtrUXlDaUZVdmZyTnFrNCtnb1poMDdWaXl2NXBDRVplM1NQU2RSaVNFeGRTaGZxYTRRdjI5eGl2UG1iWTJDQW0yYm9JMWV4UHA3aHZ2YnZsV2tjSVFGRHY1ZHl1aWpGTytPNWNqTEV3Z2FqRnJTcjlXOXdxSGNqR1M1U2hOYi9HZ3VERjZMM1haUTR4WHN1MmZMRUk2QTU0S21sWEZmcWVwSWNsM2tweklUbTJjQWtyVlJyblVZVGRmdlppWWhiSEg4aDkxUDBWcTVVN2JxZnZ0M2JIWlpxMjdkLzVrSWhsRXV4VzhOMTdVNTRWU0krVHFSOUd4anV1TzZObkdQMGZkLyt1QmNNeXZjQ1BMQWNBPT0iLCJodHRwOi8vc2NoZW1hcy5taWNyb3NvZnQuY29tL3dzLzIwMDgvMDYvaWRlbnRpdHkvY2xhaW1zL3VzZXJkYXRhIjoiNGY3OGZjMDQ5ZTQ4NDU5MGE4NzUiLCJleHAiOjE3MTkxNzUzNDMsImlzcyI6IkNlbGNvaW5BUEkiLCJhdWQiOiJDZWxjb2luQVBJIn0.2OK0o_ziIteX7SEH1s2qn668xyOGaf7Q1ZrcdvVnCzw");
          
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            var response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            connection.disconnect();

            // String com nosso Json
            return response.toString();

        }catch (Exception e){

            e.printStackTrace();

            return null;
        }
    }
}

