package GUILHERME_HARMATIUK_ARANTES.segundob.prova;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class RequestMapper {
    public static HttpURLConnection createRequestSkeleton(
        URL url,
        String requestType
    )  throws ProtocolException, IOException {
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod(requestType);
        return connection;
    }    

    public static void aditionalSettingsForPostRequest (
        HttpURLConnection connection
    ) throws Exception {
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = Menu.getUserInputAsJson().getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }
    }
}
