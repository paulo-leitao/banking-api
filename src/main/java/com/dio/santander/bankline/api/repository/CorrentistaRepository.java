package com.dio.santander.bankline.api.repository;

import com.dio.santander.bankline.api.model.Correntista;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
    List<Correntista> findByUid(String uid);
}
