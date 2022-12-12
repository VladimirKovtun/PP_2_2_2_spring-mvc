package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping()
    public String printCars(ModelMap model) {
        model.addAttribute("listCars", carService.allCars());
        return "cars";
    }

    @GetMapping("/")
    public String getIndexCars(@RequestParam int count, ModelMap model) {
        model.addAttribute("listCars", carService.getCountedCars(count));
        return "cars";
    }
}
