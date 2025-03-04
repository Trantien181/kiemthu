package org.example.service;

public class Phan1service {
     
    public static Integer tinhTong(int n){
        int tong = 0;
        for (int i = 0; i<=n ; i++){
            if (i % 2 != 0 ){
                tong+=i;
            }
        }
        return  tong;
    }
}
