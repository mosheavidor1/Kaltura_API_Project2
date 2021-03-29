import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Register_Request_Print
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args)
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();


        try {FileReader reader = new FileReader("Register_Request.json");

            //Read JSON file
            Object obj = jsonParser.parse(reader);

            // JSONArray employeeList = (JSONArray) obj;
            System.out.println(obj);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


}
