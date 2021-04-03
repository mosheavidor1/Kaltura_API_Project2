import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class RunSet {


    @BeforeMethod
    public void beforeMethod() {


    }


    @Test(priority = 1)
    public void Print_Register_01() {


        Register_Request_Print.print_Request();

        Register_Response_Print.print_Response();



    }

    @Test(priority = 2)
    public void Print_Login_02() {

        Login_Request_Print.print_Request();
        Login_Response_Print.print_Response();
    }

    @Test(priority = 3)
    public void Post_Register_03() throws IOException {

        Post_Request.Post_RG();{

        }

    }
    @Test(priority = 4)
    public void Post_Login_04() throws IOException {

Post_Request.Post_Login();

}

@Test(priority = 5)
public void Print_RegisterHeaders_05() throws IOException {
        Register_Request_Print.print_Header();

    }

    @Test(priority = 6)
    public void Print_LoginHeaders_06() throws IOException {
Login_Request_Print.print_Header();

    }



    @Test (priority = 7)

    public void Assert_API_Chosen_Header_07() throws IOException {
        Assert_API_Action.Assert_API_Header();

    }
        @Test(priority = 8)

        public void Assert_API_String_08() throws IOException {

            Assert_API_Action.Is_String();
    }

    @Test(priority = 9)

    public  void Assert_API_Integer_09() throws IOException{
        Assert_API_Action.Is_Integer();
    }

    @Test(priority = 10)
    public  void Last_Login_10() throws IOException {
        Login_Request_Print.print_Header();

        Login_Request_Print.print_Request();

        Last_Login.Last_Log();
    }

        @Test(priority = 11)
                public void Catch_Register_Error_11() throws IOException{
            Register_Request_Print.print_Header();

            Register_Request_Print.print_Request();

            Register_Response_Print.print_Response();

            Registration_Error.print_Request();


    }

    @AfterMethod
        public void afterMethod() {


        }
    }

