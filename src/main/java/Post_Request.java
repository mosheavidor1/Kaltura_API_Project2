import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Post_Request {

    public static HttpURLConnection Post_RG() throws IOException {

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

        System.out.println("Post Request for registration :");
        System.out.println(httpConnection.getResponseCode());
        System.out.println(httpConnection.getResponseMessage());
        System.out.println(httpConnection.getRequestMethod());
        System.out.println(httpConnection.getResponseMessage());


        return httpConnection;

}

    public static HttpURLConnection Post_Login() throws IOException {


        URL url = new URL(Constans_Page.Assert_API_Login);
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

        httpConnection.setRequestMethod("POST");
        httpConnection.setRequestProperty("Content-Type", "application/json");
        httpConnection.setRequestProperty("Accept", "application/json");

        httpConnection.setDoOutput(true);
        OutputStream outStream = httpConnection.getOutputStream();
        OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream, "UTF-8");
        outStreamWriter.write(Constans_Page.Login_Response_Print);
        outStreamWriter.flush();
        outStreamWriter.close();
        outStream.close();

        System.out.println("Post Request for Login:");
        System.out.println(httpConnection.getResponseCode());
        System.out.println(httpConnection.getResponseMessage());
        System.out.println(httpConnection.getRequestMethod());
        System.out.println(httpConnection.getResponseMessage());




        return httpConnection;
    }
}

