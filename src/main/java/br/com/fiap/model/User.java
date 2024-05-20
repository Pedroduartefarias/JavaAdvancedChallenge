package br.com.fiap.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;

public class User {

    
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @NotEmpty(message = "O usuario não pode estar vazio")
    @Column(unique = true)
    private String username;

    @NotNull(message = "A senha não pode estar nula")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return username;
    }

    public void setUsuario(String usuario) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
