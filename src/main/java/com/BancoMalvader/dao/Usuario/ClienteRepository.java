package com.BancoMalvader.dao.Usuario;

import com.BancoMalvader.model.Usuario.Cliente;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    @Override
    Optional<Cliente> findById(Integer integer);
}
