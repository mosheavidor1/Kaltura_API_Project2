import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Registration_Error {


    public static Object print_Request() {

        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader = new FileReader(Constans_Page.Error_Json);


            Object obj = jsonParser.parse(reader);


            System.out.println("Post Register Error:" + obj);
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
}