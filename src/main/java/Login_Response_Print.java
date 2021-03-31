import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Login_Response_Print
{
    @SuppressWarnings("unchecked")
    //  public static void main(String[] args)
    public static Object print_Response() {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();

        try {FileReader reader = new FileReader("Login_Response.json");

            //Read JSON file
            Object obj = jsonParser.parse(reader);

            // JSONArray employeeList = (JSONArray) obj;
            //   Register_Post_call obj2 = new Register_Post_call();


            System.out.println(obj);
            return obj;




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return true;
    }


}
