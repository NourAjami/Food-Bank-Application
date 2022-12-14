package edu.ucalgary.ensf409;

import java.util.Comparator;

public class InverseCalComparator implements Comparator<FoodAttributes> {
    public int compare(FoodAttributes a, FoodAttributes b) {
        int SumA = SumInverseCalories(a);
        int SumB = SumInverseCalories(b);
        if(SumA == SumB) {
            return 0;
        }
        else if(SumA < SumB) {
            return -1;
        }
        else return 1;
    }

    private int SumInverseCalories(FoodAttributes a) {
        int sum = 0;
        sum = a.GetSumExcept(FoodType.CAL);

        return sum;
    }

}
