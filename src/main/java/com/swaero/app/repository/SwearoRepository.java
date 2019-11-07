package com.swaero.app.repository;

import com.swaero.app.model.Swaero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwearoRepository extends JpaRepository<Swaero, Integer> {
}
