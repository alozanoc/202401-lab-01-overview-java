package pe.edu.upao.transaccionales.lab1.hampcode;


import pe.edu.upao.transaccionales.lab1.hampcode.dto.ReservationRecord;
import pe.edu.upao.transaccionales.lab1.hampcode.model.Reservation;
import pe.edu.upao.transaccionales.lab1.hampcode.service.ReservationService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReservationService reservationService = new ReservationService();
        ReservationRecord reservationRecord = new ReservationRecord("101","Pablo","2024-04-04");

        Reservation reservation01 = new Reservation("101","Henry","2024-04-04");
        Reservation reservation02 = new Reservation("102","Juan","2024-04-02");
        Reservation reservation03 = new Reservation("103","Patricia","2024-04-04");
        System.out.println(reservation01.toString());
        System.out.println(reservation02.toString());

        System.out.println("==========================================");
        reservationService.registerReservation(reservation01);
        reservationService.registerReservation(reservation02);
        reservationService.registerReservation(reservation03);

        List<Reservation> reservations = reservationService.
                filterReservationByDate("2024-04-02");

        for (var reservation:reservations) {
            System.out.println(reservation.toString());
        }
        System.out.println("==========================================");
        reservationService.filterReservationByDate("2024-04-02")
                .forEach(System.out::println);

        System.out.println("==========================================");
        reservationService.countReservationByDate()
                .forEach((date, count)-> System.out.printf("Date: %s, Count: %d%n", date, count));
        System.out.println("==========================================");
        System.out.println(reservationRecord.toString());

    }
}