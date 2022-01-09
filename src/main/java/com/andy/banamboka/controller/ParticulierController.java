package com.andy.banamboka.controller;

import com.andy.banamboka.model.Entreprise;
import com.andy.banamboka.model.Particulier;
import com.andy.banamboka.services.ParticulierService;
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
@RequestMapping("/rest/part")
public class ParticulierController implements CrudC<Particulier>{
    @Autowired
    private ParticulierService service;

    /**
     * @param particulier
     * @return
     */
    @Override
    @PostMapping("/save")
    public ResponseEntity<Particulier> save(@RequestBody Particulier particulier) throws Exception {
        Particulier part = service.save(particulier);
        if (part == null)
        return ResponseEntity.internalServerError().build();
        else
            return new ResponseEntity<Particulier>(part, HttpStatus.CREATED);
    }

    /**
     * @param particulier
     * @param id
     * @return
     */
    @Override
    @PutMapping("/update/{id}")
    public ResponseEntity<Particulier> update(@RequestBody Particulier particulier, @PathVariable Long id) throws Exception {
        if(service.checkExist(id)){
            Particulier part = service.getById(id);
            part.setNom(particulier.getNom());
            return new ResponseEntity<Particulier>(part, HttpStatus.GONE);
        }
        return ResponseEntity.notFound().build();
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
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return ResponseEntity.notFound().build();
    }

    /**
     * @param id
     * @return
     */
    @Override
    @GetMapping("find/{id}")
    public ResponseEntity<Particulier> findById(@PathVariable long id) throws Exception {
        Particulier particulier = service.getById(id);
        if (service ==null){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<Particulier>(particulier,HttpStatus.FOUND);
    }

    @Override
    @GetMapping("findAll")
    public ResponseEntity<List<Particulier>> getAll() throws Exception {
        List<Particulier> particuliers = service.getAll();
        if (particuliers != null){
            return new ResponseEntity<List<Particulier>>(particuliers, HttpStatus.FOUND);
        }
        return ResponseEntity.noContent().build();
    }

    @Override
    @GetMapping("checkExist/{id}")
    public ResponseEntity<Boolean> checkIfExist(@PathVariable long id) throws Exception {
        if(service.checkExist(id))
            return new ResponseEntity<Boolean>(true, HttpStatus.FOUND);
        return new ResponseEntity<Boolean>(false, HttpStatus.OK);
    }
}
