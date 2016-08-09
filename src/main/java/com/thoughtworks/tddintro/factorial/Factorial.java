package com.thoughtworks.tddintro.factorial;

public class Factorial {
    public Integer compute(int i) throws IllegalArgumentException{
        if (i >= 0) {
            int fact = 1;
            for (int n = 1; n <= i; n++) {
                fact *= n;
            }
            return fact;
        }
        else {
            throw new IllegalArgumentException();
        }

    }
}
