package by.itacademy.javaenterprise.borisevich.controllers;

import by.itacademy.javaenterprise.borisevich.services.SomeApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private SomeApplicationService applicationService;

    @GetMapping("/")
    public ModelAndView modelAndView() {
        ModelAndView view = new ModelAndView();
        view.setViewName("index");
        view.addObject("controllerVariable", "Model and view usage");
        view.addObject("appName", applicationService.getApplicationName());
        return view;
    }

    @GetMapping("/model")
    public String model(Model model) {
        model.addAttribute("controllerVariable", "Just model usage");
        model.addAttribute("appName", applicationService.getApplicationName());
        return "index";
    }

    @GetMapping("/map")
    public String map(Map<String, Object> model) {
        model.put("controllerVariable", "Map usage");
        model.put("appName", applicationService.getApplicationName());
        return "index";
    }
}
