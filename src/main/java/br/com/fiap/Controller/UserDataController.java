package br.com.fiap.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import br.com.fiap.model.UserData;
import br.com.fiap.repository.UserDataRepository;

@RestController
@RequestMapping("/userdata")
public class UserDataController {

    @Autowired
    private UserDataRepository userDataRepository;

    // Endpoint para adicionar um novo usuário
    @PostMapping("/add")
    public UserData addUser(@RequestBody UserData userData) {
        return userDataRepository.save(userData);
    }

    // Endpoint para listar todos os usuários
    @GetMapping("/list")
    public List<UserData> getAllUsers() {
        return userDataRepository.findAll();
    }

    // Endpoint para buscar um usuário pelo ID
    @GetMapping("/{id}")
    public UserData getUserById(@PathVariable Long id) {
        return userDataRepository.findById(id).orElse(null);
    }

    // Endpoint para atualizar um usuário existente
    @PutMapping("/update/{id}")
    public UserData updateUser(@PathVariable Long id, @RequestBody UserData userData) {
        if(userDataRepository.existsById(id)) {
            userData.setId(id);
            return userDataRepository.save(userData);
        }
        return null;
    }

    // Endpoint para excluir um usuário pelo ID
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userDataRepository.deleteById(id);
    }
}