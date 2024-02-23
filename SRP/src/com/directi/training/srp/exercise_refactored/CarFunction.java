package com.directi.training.srp.exercise;

public class CarFun
{
    private List<Car> _carsDb;

    public CarFun(List<Car> carsDb)
    {
        _carsDb = carsDb;
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
