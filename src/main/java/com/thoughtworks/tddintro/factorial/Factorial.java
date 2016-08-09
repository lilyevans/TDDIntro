package com.thoughtworks.tddintro.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i == 0)
            return 1;
        else {
            int fact = 1;
            for (int n = 1; n <= i; n++){
               fact *= n;
           }
            return fact;
        }

    }
}
