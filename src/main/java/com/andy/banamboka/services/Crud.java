package com.andy.banamboka.services;

import java.util.List;

public interface Crud<T> {
    T getById(long id);
    T save(T t);
    T update(T t);
    void deleteById(long id);
    List<T> getAll();
    boolean checkExist(long id);
}
