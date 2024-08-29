import static java.util.stream.DoubleStream.concat;

public class TipeDataString {
    private static Object lastName;

    public static void main(String[] args) {
        //perbedaan primitive dan non primitive

        //null

        String firstName = "Liberly";
        String lastName = "Djara";

        String fullName = firstName.concat( " ").concat(lastName);
        System.out.println(fullName);
    }
}
