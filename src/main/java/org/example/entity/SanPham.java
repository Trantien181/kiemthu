package org.example.entity;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
    private String ma;
    private String ten;
    private Integer namBaoHanh;
    private Float gia;
    private Integer soLuong;
    private String danhMuc;
}
