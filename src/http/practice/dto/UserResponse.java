package http.practice.dto;

import http.practice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String name;
    private int age;
    private String email;

    public static UserResponse from(User user) {

        return new UserResponse(user.getId(),user.getName(),user.getAge(),user.getEmail());

    }
}
