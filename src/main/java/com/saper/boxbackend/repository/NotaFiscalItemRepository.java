package com.saper.boxbackend.repository;

import com.saper.boxbackend.model.NotaFiscalItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaFiscalItemRepository  extends JpaRepository<NotaFiscalItem, Long>{
}
