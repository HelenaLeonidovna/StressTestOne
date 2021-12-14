package main.com.slice.train.models;

import java.util.Objects;

public class Train {


    String destination;
    String numberOfTrain;
    double time;
    int countOfPlace;

    public Train(String destination, String numberOfTrain, double time, int countOfPlace) {
        this.destination = destination;
        this.numberOfTrain = numberOfTrain;
        this.time = time;
        this.countOfPlace = countOfPlace;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setNumberOfTrain(String numberOfTrain) {
        this.numberOfTrain = numberOfTrain;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setCountOfPlace(int countOfPlace) {
        this.countOfPlace = countOfPlace;
    }

    public String getDestination() {
        return destination;
    }

    public String getNumberOfTrain() {
        return numberOfTrain;
    }

    public double getTime() {
        return time;
    }

    public int getCountOfPlace() {
        return countOfPlace;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", numberOfTrain='" + numberOfTrain + '\'' +
                ", time=" + time +
                ", countOfPlace=" + countOfPlace +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return Double.compare(train.time, time) == 0 && countOfPlace == train.countOfPlace && Objects.equals(destination, train.destination) && Objects.equals(numberOfTrain, train.numberOfTrain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, numberOfTrain, time, countOfPlace);
    }
}
