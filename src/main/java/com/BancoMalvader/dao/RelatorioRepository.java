package com.BancoMalvader.dao;

import com.BancoMalvader.model.Relatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Integer> {
    @Override
    Optional<Relatorio> findById(Integer integer);
}
