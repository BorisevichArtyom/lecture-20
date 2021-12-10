package by.itacademy.javaenterprise.borisevich.dao;

import by.itacademy.javaenterprise.borisevich.exception.DAOException;

import java.util.List;

public interface DAO<T> {

    void saveOrUpdate(T entity) throws DAOException;
    T findById(Long id) throws DAOException;
    void deleteById(Long id) throws DAOException;
    List<T> findAll() throws DAOException;
}
