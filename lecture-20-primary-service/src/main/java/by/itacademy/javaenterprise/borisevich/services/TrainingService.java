package by.itacademy.javaenterprise.borisevich.services;

import by.itacademy.javaenterprise.borisevich.dao.TrainingDAO;
import by.itacademy.javaenterprise.borisevich.entity.Training;
import by.itacademy.javaenterprise.borisevich.exception.DAOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TrainingService {
    @Autowired
    private TrainingDAO trainingDAO;
    @Value("${application.name}")
    private String applicationName;

    public List<Training> showAll() {
        List<Training> trainings = null;
        try {
            trainings = trainingDAO.findAll();
        } catch (DAOException e) {
            log.info("Cant show trainings", e);
        }
        return trainings;
    }

    public Long saveTraining(Training training) {
        long count = 0;
        try {
            trainingDAO.saveOrUpdate(training);
            count = trainingDAO.count();
        } catch (DAOException e) {
            log.info("Error with saving", e);
        }
        return count;
    }

    public String getApplicationName() {
        return applicationName;
    }
}
