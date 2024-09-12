package GUILHERME_HARMATIUK_ARANTES.segundob.prova;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class ResponseReader {
    public static String readResponse (HttpURLConnection connection) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder res = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) { res.append(line); }
        reader.close();
        connection.disconnect();
        return res.toString();
    }
}
