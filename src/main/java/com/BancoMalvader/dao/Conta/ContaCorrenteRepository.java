package com.BancoMalvader.dao.Conta;

import com.BancoMalvader.model.Conta.ContaCorrente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Integer> {
    @Override
    Optional<ContaCorrente> findById(Integer integer);
}
