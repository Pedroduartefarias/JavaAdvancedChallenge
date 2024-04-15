package br.com.fiap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.model.UserData;
import br.com.fiap.repository.UserDataRepository;

@RestController
@RequestMapping("/userdata")
public class UserDataController {

    @Autowired
    private UserDataRepository userDataRepository;

    @PostMapping("/add")
    public UserData addUser(@RequestBody UserData userData) {
        return userDataRepository.save(userData);
    }
}