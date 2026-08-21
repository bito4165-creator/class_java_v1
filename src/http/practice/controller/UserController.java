package http.practice.controller;

import http.practice.dto.UserCreateRequest;
import http.practice.dto.UserResponse;
import http.practice.dto.UserUpdateRequest;
import http.practice.service.UserService;

import java.util.List;

//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    // 전체 회원 조회
//    @GetMapping
//    public List<UserResponse> getUsers() {
//
//        return userService.getUsers();
//    }
//
//    // 회원 한 명 조회
//    @GetMapping("/{id}")
//    public UserResponse getUser(
//            @PathVariable Long id
//    ) {
//
//        return userService.getUser(id);
//    }
//
//    // 회원가입
//    @PostMapping
//    public UserResponse createUser(
//            @RequestBody UserCreateRequest request
//    ) {
//
//        return userService.createUser(request);
//    }
//
//    // 회원 수정
//    @PutMapping("/{id}")
//    public UserResponse updateUser(
//            @PathVariable Long id,
//            @RequestBody UserUpdateRequest request
//    ) {
//
//        return userService.updateUser(id, request);
//    }
//
//    // 회원 삭제
//    @DeleteMapping("/{id}")
//    public void deleteUser(
//            @PathVariable Long id
//    ) {
//
//        userService.deleteUser(id);
//    }
//}
