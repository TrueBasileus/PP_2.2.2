package web.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.List;

import web.dao.CarDAO;

@Service
public class CarService {

    @Autowired
    private CarDAO carDAO;

    public List<Car> getCars(Integer count) {
        return carDAO.getCars(count);
    }
}
