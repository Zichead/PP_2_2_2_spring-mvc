package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

@Controller
@RequestMapping("/cars")
public class CarController {


    CarService carService = new CarServiceImp();
    public String getCars (@RequestParam ( value = "count", defaultValue = "5")  int count, ModelMap model) {

        model.addAttribute("cars", carService.getCarsToIndex(count));

        return "cars";
    }



}
