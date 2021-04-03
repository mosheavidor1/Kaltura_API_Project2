import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Login_Request_Print {


    public static Object print_Request() {

        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader = new FileReader(Constans_Page.Login_Request_Print);


            Object obj = jsonParser.parse(reader);



            System.out.println("Login Request"+obj);
            return obj;


        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static HttpURLConnection print_Header() throws IOException {



            URL url = new URL(Constans_Page.Assert_API_Login);
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

            httpConnection.setRequestMethod("POST");
            httpConnection.setRequestProperty("Content-Type", "application/json");
            httpConnection.setRequestProperty("Accept", "application/json");

            httpConnection.setDoOutput(true);
            OutputStream outStream = httpConnection.getOutputStream();
            OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream, "UTF-8");
            outStreamWriter.write(Constans_Page.Login_Request_Print);
            outStreamWriter.flush();
            outStreamWriter.close();
            outStream.close();



              System.out.println("Print Login Headers"+httpConnection.getHeaderFields());

        return httpConnection;
        }
}








