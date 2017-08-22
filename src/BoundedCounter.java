/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class BoundedCounter {

    private int value;
    private int upperBound;

    public BoundedCounter(int upperBoundAtStart) {
        this.value = 0;
        this.upperBound = upperBoundAtStart;
    }

    public void next() {
        if (value < upperBound) {
            value++;
        } else {
            value = 0;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= upperBound) {
            this.value = newValue;
        }
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }
}
