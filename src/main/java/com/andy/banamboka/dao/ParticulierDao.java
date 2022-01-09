package com.andy.banamboka.dao;

import com.andy.banamboka.model.Particulier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticulierDao extends JpaRepository<Particulier,Long> {
}
