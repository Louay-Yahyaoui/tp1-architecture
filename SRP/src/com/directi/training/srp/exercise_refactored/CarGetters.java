package com.directi.training.srp.exercise;

public class CarGetters
{
    public CarGetters(List<Car> carsDb)
    {
        _carsDb = carsDb;
    }
    public Car getFromDb(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.toString());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
