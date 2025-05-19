package com.BancoMalvader.dao.Conta;

import com.BancoMalvader.model.Conta.ContaPoupanca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContaPoupancaRepository extends JpaRepository<ContaPoupanca, Integer> {
    @Override
    Optional<ContaPoupanca> findById(Integer id);
}
