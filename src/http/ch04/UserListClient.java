package http.ch04;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class UserListClient {
    public static void main(String[] args) {
        // https://jsonplaceholder.typicode.com/users/1
        String urlString = "https://jsonplaceholder.typicode.com/users";
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

                TypeToken<List<User>> typeToken = new TypeToken<List<User>>(){};

                List<User> userList = gson.fromJson(sb.toString(), typeToken.getType());

                int searchUserCount;
                searchUserCount = 5;
                for (int i = 0; i < searchUserCount; i++) {
                    System.out.println(userList.get(i));
                }


            }




        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
