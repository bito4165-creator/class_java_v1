package http.practice.service;

import http.practice.dto.UserCreateRequest;
import http.practice.dto.UserResponse;
import http.practice.dto.UserUpdateRequest;
import http.practice.entity.User;
import http.practice.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 회원가입
    public UserResponse createUser(UserCreateRequest request) {
        // 이메일 중복 확인
        if (userRepository.existByEmail(request.getEmail())) {
            throw new RuntimeException("이미 존재하는 이메일입니다.");
        }

        // Dto -> Entity
        User user = new User(
                userRepository.getNextId(),
                request.getName(),
                request.getAge(),
                request.getEmail()
        );

        // 저장
        userRepository.save(user);

        // Entity -> Response Dto
        return UserResponse.from(user);
    }

    // 전체 조회
    public List<UserResponse> getUsers() {

        return userRepository.findAll()
                .stream()
                .map(UserResponse::from)
                .toList();
    }

    // 한명 조회.
    public UserResponse getUser(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("회원을 찾을 수 없습니다"));
        return UserResponse.from(user);
    }

    // 회원 수정
    public UserResponse updateUSer(Long id, UserUpdateRequest request) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("회원을 찾을수 없습니다."));
        user.update(
                request.getName(),
                request.getAge(),
                request.getEmail()
        );

        return UserResponse.from(user);
    }

    // 회원 삭제
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("회원을 찾을 수 없습니다."));
        userRepository.delete(user);
    }

}
