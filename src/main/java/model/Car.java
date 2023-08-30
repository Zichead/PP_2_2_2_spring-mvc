package model;

import java.util.Objects;

public class Car {

    private String model;

    private int series;

    private int yearOfRelease;

    public Car(String model, int series, int yearOfRelease) {
        this.model = model;
        this.series = series;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (series != car.series) return false;
        if (yearOfRelease != car.yearOfRelease) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + series;
        result = 31 * result + yearOfRelease;
        return result;
    }
}
