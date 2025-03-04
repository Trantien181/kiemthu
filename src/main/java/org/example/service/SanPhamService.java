package org.example.service;

import org.example.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> listSP;
    public SanPhamService (){
        listSP.add(new SanPham("SP001","quan",2025,50000f,100,"xuat khau"));
    }
    public void addSanPham(SanPham sp){
        listSP.add(sp);
    }
    public void deleteSanPham(SanPham sp){
        listSP.remove(sp);
    }

}
