package service.impl;
import model.Car;
import org.springframework.stereotype.Component;
import service.CarService;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService {

    private final List<Car> carsList;

    public CarServiceImp() {
        carsList = new ArrayList<>();

        carsList.add((new Car("Model1", 1, 2010)));
        carsList.add((new Car("Model2", 2, 2011)));
        carsList.add((new Car("Model3", 3, 2012)));
        carsList.add((new Car("Model4", 4, 2023)));
        carsList.add((new Car("Model5", 5, 2014)));
    }
    @Override
    public List<Car> getCarsToIndex(int index) {
        if (index>0) {
            return carsList.stream().limit(index).toList();
        } else {
            return carsList;
        }
    }
}
