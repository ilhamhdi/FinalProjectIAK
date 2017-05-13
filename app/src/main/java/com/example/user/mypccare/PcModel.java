package com.example.user.mypccare;

import java.io.Serializable;

/**
 * Created by USER on 11/05/2017.
 */

public class PcModel implements Serializable {

    String namaIndo, detail;
    int gambar, picture;

    public PcModel(String namaIndo, String detail, int gambar, int picture) {
        this.namaIndo = namaIndo;
        this.detail = detail;
        this.gambar = gambar;
        this.picture = picture;
    }

    public String getNamaIndo() {
        return namaIndo;
    }

    public String getDetail() {
        return detail;
    }

    public int getGambar() {
        return gambar;
    }

    public int getPicture() {
        return picture;
    }
}
