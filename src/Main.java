
import com.engeto.ja.hotel.Booking;
import com.engeto.ja.hotel.BookingManager;
import com.engeto.ja.hotel.Guest;
import com.engeto.ja.hotel.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla Malíková", LocalDate.of(1993,3,13));
        Guest guest2 = new Guest("Jan Dvořáček", LocalDate.of(1995,5,5));
        Guest guest3 = new Guest("Karel Dvořák",LocalDate.of(1990,5,15);
        Guest guest4 = new Guest("Karel Dvořák",LocalDate.of(1979,1,3));
        Guest guest5 = new Guest("Karolína Tmavá",LocalDate.of(2000,1,1));
        Room room1 = new Room(1,1,true,true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2,1,true,true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3,3,false,true, BigDecimal.valueOf(2400));
        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(new Booking(room3,guest3,LocalDate.of(2023,6,1),LocalDate.of(2023,6,7),true));
        bookingManager.addBooking(new Booking(room2,guest4,LocalDate.of(2023,7,18),LocalDate.of(2023,7,21),false));

        for (int i = 1; i <= 20; i = i+2) {
            bookingManager.addBooking(new Booking(room2,guest5,LocalDate.of(2023,8,i),LocalDate.of(2023,8,i+1),false));

            bookingManager.addBooking(new Booking(room3,guest5,LocalDate.of(2023,8,1),LocalDate.of(2023,8,31),false));


        }






        Booking booking1 = new Booking(room1,guest1,LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26), true);
        Booking booking2 = new Booking(room3,guest1,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),true);
        Booking booking3 = new Booking(room3,guest2,LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),true);



        List<Booking>bookingList=new ArrayList<>();

        System.out.println("Rooms available:");
        System.out.println(room1+"Kč");
        System.out.println(room2+"Kč");
        System.out.println(room3+"Kč");

        System.out.println("List of booking:");
        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.add(booking3);

        bookingList.forEach(System.out::println);
    }
}