package com.BancoMalvader.dao.Usuario;

import com.BancoMalvader.model.Usuario.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    Optional<Funcionario> findById(Integer IdFuncionario);
}
