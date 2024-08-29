public class KonversiNumber {
    public static void main(String[] args) {
    //Widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        //Narrowing
        int tipeDataInt2 = 128;
        byte tipeDataByte2 = (byte) tipeDataInt2;
        System.out.println(tipeDataByte2);
    }

}
