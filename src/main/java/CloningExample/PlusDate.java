package CloningExample;

import java.time.LocalDate;

public class PlusDate {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.now();
        LocalDate secondDate = firstDate.plusDays(40);
        System.out.println(firstDate.isAfter(secondDate));
        System.out.println(firstDate.isBefore(secondDate));
    }
}
