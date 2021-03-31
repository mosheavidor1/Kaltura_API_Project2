//import org.json.JSONObject;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.util.HashMap;
//import java.util.Map;
//
//
//
//
//        public static void main(String[] args) {
//            try {
//                Send_HTTP_Post_Request.call_me();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        public static void call_me() throws Exception {
//            String urlLink = "https://api.frs1.ott.kaltura.com/api_v3/service/ottuser/action/register";
//            URL url = new URL(urlLink);
//
//            Map<String, Object> map = new HashMap<String, Object>();
//            map.put("apiVersion", "6.0.0");
//            map.put("partnerId", 3197);
//
//            Map<String, Object> params = new HashMap<String, Object>();
//            params .put("objectType", "KalturaOTTUser");
//            params .put("username", "QATest_15851304173132");
//            params .put("firstName", "ott_user_lWkiwzTJJGYI");
//            params .put("lastName", "1585130417330");
//            params .put("email", "QATest_1585130417313@mailinator.com");
//            params .put("address", "ott_user_lWkiwzTJJGYI fake address");
//            params .put("city", "ott_user_lWkiwzTJJGYI fake city");
//            params .put("countryId", "5");
//            params .put("externalId", "3164004122");
//
//            map.put("user", params);
//
//            StringBuilder postData = new StringBuilder();
//            for (Map.Entry param : params.entrySet()) {
//                if (postData.length() != 0) postData.append('&');
//                postData.append(URLEncoder.encode((String) param.getKey(), "UTF-8"));
//                postData.append('=');
//                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
//            }
//            byte[] postDataBytes = postData.toString().getBytes("UTF-8");
//            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//            conn.setRequestMethod("POST");
//            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//            conn.setRequestProperty("Content-Length", String.valueOf(postDataBytes.length));
//            conn.setDoOutput(true);
//            conn.getOutputStream().write(postDataBytes);
//            Reader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
//            StringBuilder sb = new StringBuilder();
//            for (int c; (c = in.read()) >= 0;)
//                sb.append((char)c);
//            String response = sb.toString();
//            System.out.println(response);
//            JSONObject myResponse = new JSONObject(response.toString());
//            System.out.println("result after Reading JSON Response");
//            System.out.println("origin- "+myResponse.getString("origin"));
//            System.out.println("url- "+myResponse.getString("url"));
//            JSONObject form_data = myResponse.getJSONObject("form");
//            System.out.println("CODE- "+form_data.getString("CODE"));
//            System.out.println("email- "+form_data.getString("email"));
//            System.out.println("message- "+form_data.getString("message"));
//            System.out.println("name"+form_data.getString("name"));
//        }
//    }
//}
