package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.impl.CarServiceImp;

@Controller
public class CarController {


    CarService carService = new CarServiceImp();

    @GetMapping("/cars")
    public String getCars (@RequestParam ( value = "count", defaultValue = "5")  int count, ModelMap model) {

        model.addAttribute("cars", carService.getCarsToIndex(count));

        return "cars";
    }



}
