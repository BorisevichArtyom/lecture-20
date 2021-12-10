package by.itacademy.javaenterprise.borisevich.controllers;

import by.itacademy.javaenterprise.borisevich.entity.Training;
import by.itacademy.javaenterprise.borisevich.services.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
public class TrainingController {
    @Autowired
    private TrainingService trainingService;

    @GetMapping("/trainings")
    public ModelAndView modelAndView() {
        List<Training> trainings = trainingService.showAll();
        ModelAndView view = new ModelAndView();
        view.setViewName("trainings");
        view.addObject("trainings", trainings);
        view.addObject("appName", trainingService.getApplicationName());
        return view;
    }

    @PostMapping("/trainings")
    public String add(@RequestBody Training training) {
        long count = trainingService.saveTraining(training);
        return count + "";
    }

}
