package com.andy.banamboka.services;

import com.andy.banamboka.dao.ParticulierDao;
import com.andy.banamboka.model.Particulier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service("particulierService")
@Transactional
public class ParticulierService implements Crud<Particulier>{
    @Autowired
    private ParticulierDao dao;
    @Override
    public Particulier getById(long id) {
        return dao.getById(id);
    }

    @Override
    public Particulier save(Particulier particulier) {
        return dao.save(particulier);
    }

    @Override
    public Particulier update(Particulier particulier) {
        return dao.save(particulier);
    }

    @Override
    public void deleteById(long id) {
        dao.deleteById(id);
    }

    @Override
    public List<Particulier> getAll() {
        return dao.findAll();
    }

    @Override
    public boolean checkExist(long id) {
        return dao.existsById(id);
    }
}
