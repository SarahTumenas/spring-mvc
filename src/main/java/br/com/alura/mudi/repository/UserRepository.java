package br.com.alura.mudi.repository;

import br.com.alura.mudi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, String>{

    User findByUsername(String username);
}
