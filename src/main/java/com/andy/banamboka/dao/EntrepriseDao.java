package com.andy.banamboka.dao;

import com.andy.banamboka.model.Entreprise;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseDao extends JpaRepository<Entreprise, Long> {

}
