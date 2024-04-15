package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.model.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Long> {

}
