package br.com.fiap.Controller;

import br.com.fiap.model.User;
import br.com.fiap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public String registerUser(@RequestBody @jakarta.validation.Valid User user) {
        if (userRepository.findByUsername(user.getUsuario()) != null) {
            return "Username already taken";
        }
        userRepository.save(user);
        return "User registered successfully";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody @jakarta.validation.Valid User user) {
        User existingUser = userRepository.findByUsername(user.getUsuario());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return "Login successful";
        }
        return "Invalid username or password";
    }
}