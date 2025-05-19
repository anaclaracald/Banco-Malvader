package com.BancoMalvader.dao.Conta;

import com.BancoMalvader.model.Conta.ContaInvestimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContaInvestimentoRepository extends JpaRepository<ContaInvestimento, Integer> {
    @Override
    Optional<ContaInvestimento> findById(Integer integer);
}
