package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;

@Controller
@RequestMapping("/cars")
public class CarsControllers {

    @Autowired
    private CarService carService;

    @GetMapping()
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {

        model.addAttribute("cars", carService.getCars(count));
        System.out.println(count);
        return "cars";
    }
}
