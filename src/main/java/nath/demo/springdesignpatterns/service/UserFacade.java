package nath.demo.springdesignpatterns.service;

import nath.demo.springdesignpatterns.model.BookResponse;
import nath.demo.springdesignpatterns.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserFacade {
    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    public User createUser(User user) {
        // Lógica para buscar recomendações de livros da API externa
        List<String> bookRecommendations = fetchBookRecommendations(user.getStudySubject());
        // Salvar usuário no banco de dados
        return userService.saveUser(user);
    }

    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    public List<String> getBookRecommendations(Long userId) {
        User user = userService.getUserById(userId);
        return fetchBookRecommendations(user.getStudySubject());
    }

    private List<String> fetchBookRecommendations(String studySubject) {
        BookResponse response = bookService.getBooksBySubject(studySubject);
        return response.getWorks().stream()
                .limit(5)
                .map(BookResponse.Work::getTitle)
                .collect(Collectors.toList());
    }
}

