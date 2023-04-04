package org.unindra.simple_project.repository;

import java.util.List;
import java.util.Optional;

public interface CRUDRepository<T, ID> {
    T save(T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    T update(T entity);
    void deleteById(ID id);


}
