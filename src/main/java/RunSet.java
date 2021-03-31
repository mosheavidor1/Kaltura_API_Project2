import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

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



    @AfterMethod
        public void afterMethod() {


        }
    }

