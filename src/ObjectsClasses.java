import java.time.LocalDate;


public class ObjectsClasses {

    public static void main(String[] args) {


        LocalDate.now();

        System.out.println(LocalDate.now());





      LocalDate.of(1982, 11, 9);

        LocalDate newYearsEve = LocalDate.of(1982,11,9);
        int year = newYearsEve.getYear();
        System.out.println(year);
    }
}
