package com.vsk.gfg.Top50Array;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = arr.length;
        int sumOfN = n*(n-1)/2;
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.println("Missing -> " + (sumOfN - sum));
    }
}
