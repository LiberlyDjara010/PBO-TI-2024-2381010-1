public class TipeDataArray {
    public static void main(String[] args) {
        //cara1
        int[] kumpulanNumber;
        kumpulanNumber = new int[3];

        //cara memasukan value ka array
        kumpulanNumber[0] = 100;
        kumpulanNumber[1] = "Liberly";
        kumpulanNumber[2] = 200L;

        //cara mengakses
        System.out.println(kumpulanNumber[0]);

        //length
        System.out.println(kumpulanNumber.length);
    }
}
