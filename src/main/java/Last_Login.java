import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Last_Login {

    public static boolean Last_Log(){
        Login_Response_Print Assert_last_login = new Login_Response_Print();

        String Last = "lastLoginDate:";
        Assert_last_login.print_Response();
        {
            try {
                Assert.assertTrue(true, Last);
                {
                    System.out.println(Last + DateTime());
                }


            } catch (Exception e) {
                System.out.println("Last Login Date was not found ");
            }
        }
        return true;
    }

            public static String DateTime(){
            Date date = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat(Constans_Page.Date);
            String currentDate = dateFormat.format(date);

            return currentDate;
        }

        }

