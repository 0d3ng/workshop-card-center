package com.sinaungoding.workshop.reader;


import com.sinaungoding.workshop.card.DataKartuByte;
import com.sinaungoding.workshop.util.ConvertUtil;
import javax.smartcardio.*;

public class ACR122U {

    public static final byte[] defaultKeyA = {
        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
    };
    public static final byte[] defaultKeyB = {
        (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF, (byte) 0xFF
    };

    protected final byte numberBytesToReadAndWrite = 0x10; // 16 Bytes
    public static final byte KEY_A = 0x60; //key A
    public static final byte KEY_B = 0x61; //key B
    private CardChannel channel;

    private byte[] UID;

    private static final ACR122U instance;

    static {
        instance = new ACR122U();
    }

    public static enum CARD_TYPE {
        MIFARE_1K,
        MIFARE_4K,
        ISO14443_4A,
        ISO14443_4B,
        OTHER_TAG
    }
    CARD_TYPE card_type;

    private ACR122U() {
        CardTerminals terminals = TerminalFactory.getDefault().terminals();
        CardTerminal terminal = null;
        try {
            terminal = terminals.list().get(0);
            System.out.println(""+terminal.getName());
            Card card = terminal.connect("*");
            byte[] historicalBytes = card.getATR().getBytes();

            System.out.println(ConvertUtil.byteArrayToHex(historicalBytes, true));
            channel = card.getBasicChannel();
        } catch (CardException e) {
            e.printStackTrace();
        }

    }

    public static ACR122U getInstance() {
        return instance;
    }

    public CARD_TYPE getCard_type() {
        return card_type;
    }

    public String getUID() throws Exception {
        return null;
    }

    public boolean Auth(byte sectorAddress, byte[] key, byte keyType) throws Exception {
        return false;
    }

    public byte[] ReadBlock(byte blockAddress) throws Exception {
        return null;
    }

    public boolean WriteBlock(byte blockAddress, byte[] data) throws Exception {
        return false;
    }

    public boolean writeDataParkir(DataKartuByte kartuByte) {
        boolean success = false;
        return success;
    }

    public boolean readDataParkir(byte[] data) {
        boolean success = false;
        return success;
    }
}
