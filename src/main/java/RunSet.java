import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

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
    @Test

    public void whenUploadFileUsingHttpClient_thenCorrect()
            throws ClientProtocolException, IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://api.frs1.ott.kaltura.com/api_v3/service/ottuser/action/login");

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addBinaryBody(
                "file", new File("C:\\Users\\moshe\\Kaltura_API_Project\\Login_Request.json"), ContentType.APPLICATION_OCTET_STREAM, "Login_Request.json");
        HttpEntity multipart = builder.build();
        httpPost.setEntity(multipart);


        CloseableHttpResponse response = client.execute(httpPost);
        System.out.println(response);
        assertThat(response.getStatusLine().getStatusCode(), equalTo(200));
        client.close();
//    public void whenSendPostRequestUsingHttpClient_thenCorrect()
//            throws ClientProtocolException, IOException {
//        CloseableHttpClient client = HttpClients.createDefault();
//        HttpPost httpPost = new HttpPost("http://www.example.com");
//
//        List<NameValuePair> params = new ArrayList<NameValuePair>();
//        params.add(new BasicNameValuePair("username", "John"));
//        params.add(new BasicNameValuePair("password", "pass"));
//        httpPost.setEntity(new UrlEncodedFormEntity(params));
//
//        CloseableHttpResponse response = client.execute(httpPost);
//        System.out.println(params);
//        assertThat(response.getStatusLine().getStatusCode(), equalTo(400));
//
//        client.close();
    }



    @AfterMethod
        public void afterMethod() {


        }
    }

