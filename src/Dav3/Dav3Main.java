package Dav3;

import java.time.LocalDate;

public class Dav3Main {
    public static void main(String[] args)
    {
        Student a = new Student("Lasha", "Grdzelishvili", LocalDate.of(1996, 7, 22), "Sangu");
        System.out.println("Age: " + a.Age());
    }
}
