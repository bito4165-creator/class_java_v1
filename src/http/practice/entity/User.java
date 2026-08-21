package http.practice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private int age;
    private String email;

    public void update(String name,int age,String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
