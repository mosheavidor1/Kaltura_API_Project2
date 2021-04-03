import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;


public class Assert_API {
    public Map Assert_Header() throws IOException {


        URL url = new URL(Constans_Page.Assert_API);
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

        httpConnection.setRequestMethod("POST");
        httpConnection.setRequestProperty("Content-Type", "application/json");
        httpConnection.setRequestProperty("Accept", "application/json");


        httpConnection.setDoOutput(true);
        OutputStream outStream = httpConnection.getOutputStream();
        OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream, "UTF-8");
        outStreamWriter.write(Constans_Page.Register_Request_Json);
        outStreamWriter.flush();
        outStreamWriter.close();
        outStream.close();


        HttpPost request = new HttpPost(Constans_Page.Assert_API);

        CloseableHttpClient client = HttpClientBuilder.create().build();

        HttpResponse response = client.execute(request);

        BufferedReader bufReader = new BufferedReader(new InputStreamReader(
                response.getEntity().getContent()));
        Object ob = httpConnection.getHeaderFields();
        String b = Constans_Page.Chosen_Header;


        System.out.println(httpConnection.getHeaderFields());

        return httpConnection.getHeaderFields();


    }
}




