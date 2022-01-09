package com.andy.banamboka.controller;


import com.andy.banamboka.model.Entreprise;
import com.andy.banamboka.services.EntrepriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author Ir Andy
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/rest/pro")
public class EntrepriseController implements CrudC<Entreprise>{
    @Autowired
    private EntrepriseService service;
    /**
     * @param entreprise
     * @return
     */
    @Override
    public ResponseEntity<Entreprise> save(@RequestBody Entreprise entreprise) throws Exception {
        Entreprise en = service.save(entreprise);
        if (entreprise ==null)
        return ResponseEntity.internalServerError().build();
        else
            return new ResponseEntity<Entreprise>(en, HttpStatus.CREATED);
    }

    /**
     * @param entreprise
     * @param id
     * @return
     */
    @Override
    @PutMapping("/update/{id}")
    public ResponseEntity<Entreprise> update(@RequestBody Entreprise entreprise, @PathVariable Long id) throws Exception {
        Entreprise en = service.getById(id);
        if (entreprise ==null)
            return ResponseEntity.internalServerError().build();
        else {

            return new ResponseEntity<Entreprise>(en, HttpStatus.CREATED);
        }
    }

    /**
     * @param id
     * @return
     */
    @Override
    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) throws Exception {
        if (service.checkExist(id)){
            service.deleteById(id);
            return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
        }
        return ResponseEntity.notFound().build();
    }

    /**
     * @param id
     * @return
     */
    @Override
    @GetMapping("find/{id}")
    public ResponseEntity<Entreprise> findById(@PathVariable long id) throws Exception {
        Entreprise entreprise = service.getById(id);
        if (entreprise==null)
            return ResponseEntity.notFound().build();
        return new ResponseEntity<Entreprise>(entreprise, HttpStatus.FOUND);
    }

    @Override
    @GetMapping("findAll")
    public ResponseEntity<List<Entreprise>> getAll() throws Exception {
        List<Entreprise> entreprises = service.getAll();
        return new ResponseEntity<List<Entreprise>>(entreprises,HttpStatus.FOUND);
    }

    @Override
    @GetMapping("checkExist/{id}")
    public ResponseEntity<Boolean> checkIfExist(@PathVariable long id) throws Exception {
        if(service.checkExist(id))
        return new ResponseEntity<Boolean>(true, HttpStatus.FOUND);
        else
            return  new ResponseEntity<Boolean>(false, HttpStatus.OK);
    }
}
