import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Post_Request {

    //  public static void main(String[] args) throws IOException, ParseException {

    public static HttpURLConnection Post_RG() throws IOException {


        URL url = new URL("https://api.frs1.ott.kaltura.com/api_v3/service/ottuser/action/register");
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

        httpConnection.setRequestMethod("POST");
        httpConnection.setRequestProperty("Content-Type", "application/json");
        httpConnection.setRequestProperty("Accept", "application/json");

        httpConnection.setDoOutput(true);
        OutputStream outStream = httpConnection.getOutputStream();
        OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream, "UTF-8");
        outStreamWriter.write("Register_Request.json");
        outStreamWriter.flush();
        outStreamWriter.close();
        outStream.close();


        System.out.println(httpConnection.getResponseCode());
        System.out.println(httpConnection.getResponseMessage());
        //  System.out.println(httpConnection.getHeaderFields());
        System.out.println(httpConnection.getRequestMethod());
        System.out.println(httpConnection.getResponseMessage());


//            InputStream Json = httpConnection.getInputStream();
//            System.out.println(Json);

        return httpConnection;
    }

    public static HttpURLConnection Post_Login() throws IOException {


        URL url = new URL("https://api.frs1.ott.kaltura.com/api_v3/service/ottuser/action/login");
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

        httpConnection.setRequestMethod("POST");
        httpConnection.setRequestProperty("Content-Type", "application/json");
        httpConnection.setRequestProperty("Accept", "application/json");

        httpConnection.setDoOutput(true);
        OutputStream outStream = httpConnection.getOutputStream();
        OutputStreamWriter outStreamWriter = new OutputStreamWriter(outStream, "UTF-8");
        outStreamWriter.write("Login_Response.json");
        outStreamWriter.flush();
        outStreamWriter.close();
        outStream.close();


        System.out.println(httpConnection.getResponseCode());
        System.out.println(httpConnection.getResponseMessage());
        System.out.println(httpConnection.getRequestMethod());
        System.out.println(httpConnection.getResponseMessage());




        return httpConnection;
    }
}

//        try {
//            TestAuth.call_me();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void call_me() throws Exception {
//        String urlLink = "https://api.frs1.ott.kaltura.com/api_v3/service/ottuser/action/register";
//        URL url = new URL(urlLink);
//
//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("apiVersion", "6.0.0");
//        map.put("partnerId", 3197);
//
//        Map<String, Object> params = new HashMap<String, Object>();
//        params.put("objectType", "KalturaOTTUser");
//        params.put("username", "QATest_15851304173132");
//        params.put("firstName", "ott_user_lWkiwzTJJGYI");
//        params.put("lastName", "1585130417330");
//        params.put("email", "QATest_1585130417313@mailinator.com");
//        params.put("address", "ott_user_lWkiwzTJJGYI fake address");
//        params.put("city", "ott_user_lWkiwzTJJGYI fake city");
//        params.put("countryId", "5");
//        params.put("externalId", "3164004122");
//
//        map.put("user", params);
//        map.put("password", "password_SlLVWDLl");
//
//
//        StringBuilder postData = new StringBuilder();
//
//        for (Map.Entry param : params.entrySet()) {
//            if (postData.length() != 0) postData.append('&');
//            postData.append(URLEncoder.encode((String) param.getKey(), "UTF-8"));
//            postData.append('=');
//            postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
//
//            byte[] postDataBytes = postData.toString().getBytes("UTF-8");
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("POST");
//            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//            conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
//            conn.setDoOutput(true);
//            conn.getOutputStream().write(postDataBytes);
//
//            Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
//            StringBuilder sb = new StringBuilder();
//            for (int c; (c = in.read()) >= 0; )
//                sb.append((char) c);
//            String response = sb.toString();
//            System.out.println(response);
//            JSONObject myResponse = new JSONObject(response.toString());
//            System.out.println("result after Reading JSON Response");
//            System.out.println("origin- " + myResponse.getString("origin"));
//            System.out.println("url- " + myResponse.getString("url"));
//            JSONObject form_data = myResponse.getJSONObject("form");
//            System.out.println("email- " + form_data.getString("email"));
//            System.out.println("message- " + form_data.getString("message"));
//            System.out.println("name" + form_data.getString("name"));
//
//
//        }
//    }
//}