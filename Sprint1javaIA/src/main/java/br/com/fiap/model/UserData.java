package br.com.fiap.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "O nome não pode estar vazio")
    private String nome;

    @NotNull(message = "A idade não pode estar vazia")
    private Integer idade;

    @NotEmpty(message = "O gênero não pode estar vazio")
    private String genero;

    @NotEmpty(message = "O estado não pode estar vazio")
    private String estado;

    private boolean comprou;

    public UserData() {}

    public UserData(String nome, Integer idade, String genero, String estado, boolean comprou) {
        id = id;
        nome = nome;
        idade = idade;
        genero = genero;
        estado = estado;
        comprou = comprou;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        estado = estado;
    }

    public boolean isComprou() {
        return comprou;
    }

    public void setComprou(boolean comprou) {
        comprou = comprou;
    }
}
