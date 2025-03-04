package org.example.service;

public class Phan1service {
     
    public Integer tinhTongMang(int[] arr){
        if (arr == null) return 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
