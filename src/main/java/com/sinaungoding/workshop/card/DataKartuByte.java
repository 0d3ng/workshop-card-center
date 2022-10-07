package com.sinaungoding.workshop.card;

import java.util.ArrayList;
import java.util.List;


public class DataKartuByte {

    public DataKartuByte() {
    }

    public DataKartuByte(byte[] nopol, byte[] tanggal, byte status_masuk, byte[] kode_gate, byte[] nip, byte[] expired, byte status_kartu) {
    }

    public List<byte[]> getBlocks() {
        byte[] temp = new byte[48];
        List<byte[]> blocks = new ArrayList<>();
        
        return blocks;
    }
}
