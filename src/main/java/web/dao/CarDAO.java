package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAO {
    private List<Car> cars;
    private static int CARS_COUNT;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "Mazda", 100, "2000"));
        cars.add(new Car(++CARS_COUNT, "Moskvich", 100000, "1960"));
        cars.add(new Car(++CARS_COUNT, "Volga", 3434, "1990"));
        cars.add(new Car(++CARS_COUNT, "Porche", 3421038, "2018"));
        cars.add(new Car(++CARS_COUNT, "BMW", 8983, "2005"));
    }

    public List<Car> getCars(Integer count) {
        return cars.subList(0, (count == null || count > cars.size()) ? cars.size() : count);
    }

}
