package service;

import web.model.Car;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller

public interface CarService {

    List<Car> getCarsToIndex (int index);
}
