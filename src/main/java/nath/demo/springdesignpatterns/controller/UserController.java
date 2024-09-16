package nath.demo.springdesignpatterns.controller;

import jakarta.validation.Valid;
import nath.demo.springdesignpatterns.model.User;
import nath.demo.springdesignpatterns.service.UserFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserFacade userFacade;

    @PostMapping
    public ResponseEntity<User> createUser(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String studySubject) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setStudySubject(studySubject);
        User createdUser = userFacade.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userFacade.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}/recommendations")
    public ResponseEntity<List<String>> getBookRecommendations(@PathVariable Long id) {
        List<String> recommendations = userFacade.getBookRecommendations(id);
        return ResponseEntity.ok(recommendations);
    }
}

