package com.andy.banamboka.services;

import com.andy.banamboka.dao.EntrepriseDao;
import com.andy.banamboka.model.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service("entrepriseService")
@Transactional
public class EntrepriseService implements Crud<Entreprise> {
    @Autowired
    private EntrepriseDao dao;
    @Override
    public Entreprise getById(long id) {
        return dao.getById(id);
    }

    @Override
    public Entreprise save(Entreprise entreprise) {
        return dao.save(entreprise);
    }

    @Override
    public Entreprise update(Entreprise entreprise) {
        return dao.save(entreprise);
    }

    @Override
    public void deleteById(long id) {
    dao.deleteById(id);
    }

    @Override
    public List<Entreprise> getAll() {
        return dao.findAll();
    }

    @Override
    public boolean checkExist(long id) {
        return dao.existsById(id);
    }
}
