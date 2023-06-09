package com.saper.boxbackend.repository;

import com.saper.boxbackend.model.NotaFiscal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalRepository  extends JpaRepository<NotaFiscal, Long> {
}
