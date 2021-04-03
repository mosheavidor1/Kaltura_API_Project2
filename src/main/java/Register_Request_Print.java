import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Register_Request_Print {


    public static Object print_Request() {

        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader = new FileReader(Constans_Page.Register_Request_Json);


            Object obj = jsonParser.parse(reader);




            System.out.println("Post Register Request:"+obj);
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


        System.out.println("Print Register Headers"+httpConnection.getHeaderFields());

        return httpConnection;
    }
}








