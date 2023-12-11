/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doannhom4_qlnh;

/**
 *
 * @author Asus
 */
public class MonAn implements Comparable<MonAn> {

    public MonAn(String maMonAn, String tenMonAn, String hinh, int giaBan) {
        this.maMonAn = maMonAn;
        this.tenMonAn = tenMonAn;
        this.hinh = hinh;
        this.giaBan = giaBan;
    }

    private String maMonAn;
    private String tenMonAn;
    private String hinh;
    private int giaBan;

    public MonAn() {
    }

    public String getMaMonAn() {
        return maMonAn;
    }

    public void setMaMonAn(String maMonAn) {
        this.maMonAn = maMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public String Xuat() {
        String kq = maMonAn + "-" + tenMonAn + "-" + hinh + "-" + giaBan;
        return kq;
    }

    @Override
    public int compareTo(MonAn nH) {
        return tenMonAn.compareTo(nH.getTenMonAn());
    }
}
