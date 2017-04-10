package ru.vorh.model;

import java.util.List;

/**
 * Created by vorh on 4/10/17.
 */
public class RandomStat {

    private RandomNumber max;
    private RandomNumber min;

    private List<RandomNumber> randomNumberList;


    public RandomNumber getMax() {
        return max;
    }

    public void setMax(RandomNumber max) {
        this.max = max;
    }

    public RandomNumber getMin() {
        return min;
    }

    public void setMin(RandomNumber min) {
        this.min = min;
    }

    public List<RandomNumber> getRandomNumberList() {
        return randomNumberList;
    }

    public void setRandomNumberList(List<RandomNumber> randomNumberList) {
        this.randomNumberList = randomNumberList;
    }
}
