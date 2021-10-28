package com.alphacoder;

import java.util.Arrays;

public class SecondMinimum {

    public int findSecondMinimumSort(int [] x){
        if(x== null || x.length<2){
            return 0;
        }

        Arrays.sort(x);
        return x[1];
    }

    public int findSecondMinimum(int [] x){
        if(x== null || x.length<2){
            return 0;
        }

        int smallest= Integer.MAX_VALUE;
        int secondSmallest= Integer.MAX_VALUE;

        for(int element: x){
            if(element< smallest){
                secondSmallest= smallest;
                smallest= element;
            }
            else if(element< secondSmallest){
                secondSmallest= element;
            }
        }

        return secondSmallest;
    }
}
