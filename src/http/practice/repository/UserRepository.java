package http.practice.repository;

import http.practice.entity.User;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private final List<User> users = new ArrayList<>();

    private long sequence = 1L;

    // .저장
    public User save(User user) {
        users.add(user);
        return user;
    }

    // 전체 조회
    public List<User> findAll() {
        return users;
    }

    // 한명 조회
    public Optional<User> findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    // 삭제
    public void delete (User user) {
        users.remove(user);
    }

    // 이메일 확인
    public boolean existByEmail(String email) {
        return users.stream()
                .anyMatch(user -> user.getEmail().equals(email));

    }

    public Long getNextId() {
        return sequence++;
    }


}
