package com.BancoMalvader.dao;

import com.BancoMalvader.model.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuditoriaRepository extends JpaRepository<Auditoria, Integer> {
    @Override
    Optional<Auditoria> findById(Integer integer);
}
