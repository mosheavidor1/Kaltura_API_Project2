import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Login_Request_Print {

    //@SuppressWarnings("unchecked")
    //  public static void main(String[] args)
    public static Object print_Request() {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader = new FileReader("Login_Request.json");

            //Read JSON file
            Object obj = jsonParser.parse(reader);


            // JSONArray employeeList = (JSONArray) obj;

            System.out.println(obj);
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



            URL url = new URL("https://api.frs1.ott.kaltura.com/api_v3/service/ottuser/action/login");
            HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

            httpConnection.setRequestMethod("POST");
            httpConnection.setRequestProperty("Content-Type", "application/json");
            httpConnection.setRequestProperty("Accept", "application/json");

            httpConnection.setDoOutput(true);
            OutputStream outStream = httpConnection.getOutputStream();
            OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream, "UTF-8");
            outStreamWriter.write("Login_Request.json");
            outStreamWriter.flush();
            outStreamWriter.close();
            outStream.close();



              System.out.println(httpConnection.getHeaderFields());

        return httpConnection;
        }
}








