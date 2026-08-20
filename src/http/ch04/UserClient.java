package http.ch04;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UserClient {

    public static void main(String[] args) {
        // https://jsonplaceholder.typicode.com/users/1
        String urlString = "https://jsonplaceholder.typicode.com/users/1";
        HttpURLConnection conn = null;

        URL url = null;
        try {
            url = new URL(urlString);
            conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            System.out.println("응답 코드 : " + responseCode);

            if (responseCode!= 200) {
                System.out.println("응답 실패");
                return;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {

                StringBuilder sb = new StringBuilder();
                String line;
                while ( (line = reader.readLine()) != null ) {
                    sb.append(line);
                }

                Gson gson = new Gson();

                User user = gson.fromJson(sb.toString(), User.class);
                System.out.println(user.getId());
                System.out.println(user.getUsername());
                System.out.println(user.getEmail());
                System.out.println(user.getAddress());
                System.out.println(user.getPhone());
                System.out.println(user.getWebsite());
                System.out.println(user.getCompany());
                System.out.println(user.toString());


            }




        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
