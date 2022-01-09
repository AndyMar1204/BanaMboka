package com.andy.banamboka.controller;


import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Ir Andy
 * @param <T>
 */
public interface CrudC<T> {
    /**
     *
     * @return
     */
    ResponseEntity<T> save(T t) throws Exception;

    /**
     *
     * @param t
     * @return
     */
    ResponseEntity<T> update(T t,Long id) throws Exception;

    /**
     *
     * @return
     */
    ResponseEntity<Void> delete(long id) throws Exception;

    /**
     *
     * @param id
     * @return
     */
    ResponseEntity<T> findById(long id) throws Exception;
    ResponseEntity<List<T>> getAll() throws Exception;
ResponseEntity<Boolean> checkIfExist(long id) throws Exception;
    }
