import com.sun.deploy.net.HttpRequest;
import okhttp3.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLEncoder;

import java.util.HashMap;
import java.util.Map;


import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import sun.net.www.http.HttpClient;
import utils.HttpUtility;

import java.io.IOException;
import java.util.HashMap;

public class Register_Post_call {

    // one instance, reuse
    private final OkHttpClient httpClient = new OkHttpClient();

    public static void main(String[] args) throws Exception {

        Register_Post_call obj = new Register_Post_call();


        //  System.out.println("Testing 1 - Send Http GET request");
        //    obj.sendGet();


      // System.out.println("Testing 2 - Send Http POST request");

       obj.sendPost();



    }
//
//    private void sendGet() throws Exception {
//
//        Request request = new Request.Builder()
//                .url("https://www.google.com/search?q=mkyong")
//                .addHeader("custom-key", "mkyong")  // add request headers
//                .addHeader("User-Agent", "OkHttp Bot")
//                .build();
//
//        Response response = httpClient.newCall(request).execute();
//        {
//
//            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
//
//            // Get response body
//            System.out.println(response.body().string());
//        }
//
//    }

    private void sendPost() throws Exception {

        String url = "https://api.frs1.ott.kaltura.com/api_v3/service/ottuser/action/register";

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("apiVersion", "6.0.0");
       map.put("partnerId", 3197);

        Map<String, Object> params = new HashMap<String, Object>();
        params .put("objectType", "KalturaOTTUser");
        params .put("username", "QATest_15851304173132");
        params .put("firstName", "ott_user_lWkiwzTJJGYI");
        params .put("lastName", "1585130417330");
        params .put("email", "QATest_1585130417313@mailinator.com");
        params .put("address", "ott_user_lWkiwzTJJGYI fake address");
        params .put("city", "ott_user_lWkiwzTJJGYI fake city");
        params .put("countryId", "5");
        params .put("externalId", "3164004122");

        map.put("user", params);

        StringBuilder postData = new StringBuilder();
        for (Map.Entry<String,Object>param:params.entrySet()) {
            if (postData.length() != 0) postData.append('&');
            postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
            postData.append('=');
            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
        }
        byte[] postDataBytes = postData.toString().getBytes("UTF-8");


        }

        }





//        try {
//            HttpUtility.sendPostRequest(requestURL, params );
//            String[] response = HttpUtility.readMultipleLinesRespone();
//            for (String line : response) {
//                System.out.println(line);
//            }
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        HttpUtility.disconnect();
//    }
//}





//        // form parameters
//        RequestBody user = new FormBody.Builder()
//                .add("objectType", "KalturaOTTUser")
//                .add("username", "QATest_15851304173132")
//                .add("firstName", "ott_user_lWkiwzTJJGYI")
//                .add("lastName", "1585130417330")
//                .add("email", "QATest_1585130417313@mailinator.com")
//                .add("address", "ott_user_lWkiwzTJJGYI fake address")
//                .add("city", "ott_user_lWkiwzTJJGYI fake city")
//                .add("countryId", "5")
//                .add("externalId", "3164004122")
//                .build();
//
//        Request request = new Request.Builder()
//                .url("https://api.frs1.ott.kaltura.com/api_v3/service/ottuser/action/register")
//                .addHeader("apiVersion", "6.0.0")
//                .addHeader("partnerId", "3197")
//                .addHeader("password", "password_SlLVWDLl")
//                .post(user)
//                .build();
//
//        Response response = httpClient.newCall(request).execute();
//        {
//
//
//            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
//
//            // Get response body
//            System.out.println(response.body().string());
//        }
//
//    }
//}
//

//}
//
//    private void sendPost() throws Exception {
//
//        // form parameters
//        RequestBody formBody = new FormBody.Builder()
//                .add("username", "abc")
//                .add("password", "123")
//                .add("custom", "secret")
//                .build();
//
//        Request request = new Request.Builder()
//                .url("https://httpbin.org/post")
//                .addHeader("User-Agent", "OkHttp Bot")
//                .post(formBody)
//                .build();