package by.itacademy.javaenterprise.borisevich.dao.impl;

import by.itacademy.javaenterprise.borisevich.dao.TrainingDAO;
import by.itacademy.javaenterprise.borisevich.entity.Training;
import by.itacademy.javaenterprise.borisevich.exception.DAOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Slf4j
@Repository
public class TrainingDAOImpl implements TrainingDAO {
    @PersistenceContext
    @Qualifier("entityManagerFactory")
    private EntityManager entityManager;

    @Override
    @Transactional
    public void saveOrUpdate(Training training) throws DAOException {
        try {
            Training training1 = entityManager.find(Training.class, training.getId());
            if (training1 != null) {
                entityManager.merge(training);
            }
        } catch (NullPointerException e) {
            entityManager.persist(training);
        }
    }


    @Override
    public Training findById(Long id) throws DAOException {
        return null;
    }

    @Override
    public void deleteById(Long id) throws DAOException {

    }

    @Override
    public List<Training> findAll() throws DAOException {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Training> cr = cb.createQuery(Training.class);
        Root<Training> root = cr.from(Training.class);
        cr.select(root);
        Query query = entityManager.createQuery(cr);
        return (List<Training>) query.getResultList();
    }

    @Transactional(readOnly = true)
    public long count() {
        Long count = entityManager
                .createQuery("select count(m) from Training m", Long.class)
                .getSingleResult();
        return count;
    }
}
