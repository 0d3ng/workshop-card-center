package com.sinaungoding.workshop.util;

import java.util.Arrays;
import java.util.Date;

public class ConvertUtil {

    public static String dateToHex(Date date) {
        return Long.toHexString(date.getTime()).toUpperCase();
    }

    public static Long hexToLong(String hex) {
        return Long.valueOf(hex);
    }

    public static String byteArrayToHex(byte data[], boolean space) {
        StringBuilder sb = new StringBuilder();
        for (byte b : data) {
            sb.append(String.format("%02x", b));
            if (space) {
                sb.append(" ");
            }
        }
        return sb.toString().toUpperCase();
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    public static String zeroPadding(String text, int size) {
        StringBuilder builder = new StringBuilder(text);
        String temp = "";
        int length = builder.length();
        while (length < size) {
            temp += "0";
            length++;
        }
        temp += builder.toString();
        return temp;
    }

    public static byte[] trim(byte[] bytes) {
        int i = bytes.length - 1;
        while (i >= 0 && bytes[i] == 0) {
            --i;
        }
        return Arrays.copyOf(bytes, i + 1);
    }

    public static byte[] longToBytes(long l) {
        byte[] result = new byte[4];
        for (int i = 3; i >= 0; i--) {
            result[i] = (byte) (l & 0xFF);
            l >>= 8;
        }
        return result;
    }

    public static long bytesToLong(byte[] b) {
        long result = 0;
        for (int i = 0; i < b.length; i++) {
            result <<= 8;
            result |= (b[i] & 0xFF);
        }
        return result;
    }

    public static void main(String[] args) {
//        Date date = new Date();
//        long tm = date.getTime() / 1000L;
//        log.info(tm);
//        log.info(byteArrayToHex(longToBytes(date.getTime() / 1000L), false));
//        log.info(longToBytes(date.getTime() / 1000L).length);
//        log.info(hexStringToByteArray(dateToHex(new Date(tm))).length);
//        log.info(dateToHex(new Date(date.getTime() / 1000L)));
//        String hex = byteArrayToHex("NOPRIANTO".getBytes(), false);
//        log.info(hex);
//
//        byte[] names = "NOPRIANTO".getBytes();
//        log.info(Arrays.toString(names));
//
//        byte[] bytes = hexStringToByteArray(hex);
//        log.info(Arrays.toString(bytes));
//
//        log.info(new String(bytes));
//        log.info(zeroPadding("NOPRIANTO", 10));
//        log.info("");
//        log.info("");
//        String nopol = "AB2039YQ";
////                        String nopol = "N2000YQ";
//        byte[] np = new byte[10];
//        System.arraycopy(nopol.getBytes(), 0, np, 0, nopol.length());
//        long dd = System.currentTimeMillis() / 1000;
//        byte[] tanggal = ConvertUtil.longToBytes(dd);
//        byte stIn = 1;
//        String hexString = Integer.toHexString(300);
//        hexString = ConvertUtil.zeroPadding(hexString, 4);
//        log.info(hexString);
//        byte[] byteArray = ConvertUtil.hexStringToByteArray(hexString);
//        log.info(Arrays.toString(byteArray));
//        byte gate[] = new byte[2];
//        System.arraycopy(byteArray, 0, gate, 0, byteArray.length);
////                        String nip = "198911082019031020";//nopri
//        String nip = "197911152005012002";//bu dwi
//        byte stKartu = 1;
//        DataKartuByte kartuByte = new DataKartuByte(np, tanggal, stIn, gate,
//                nip.getBytes(), tanggal, stKartu);
//        log.info(ConvertUtil.byteArrayToHex(kartuByte.getData(), true));
//        List<byte[]> blocks = kartuByte.getBlocks();
//        for (byte[] block : blocks) {
//            log.info(ConvertUtil.byteArrayToHex(block, true));
//        }
//        DataKartuString kartuString = new DataKartuString(kartuByte.getData());
//        log.info(kartuString.getTanggal());
//        log.info(kartuString.getExpired());
//        log.info(dd);
//        Instant instant = Instant.ofEpochSecond(kartuString.getTanggal());
//        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
//        log.info(zonedDateTime.toLocalDateTime().toString());
    }
}
