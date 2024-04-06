package pe.edu.upao.transaccionales.lab1.hampcode.service;


import pe.edu.upao.transaccionales.lab1.hampcode.dto.ReservationRecord;
import pe.edu.upao.transaccionales.lab1.hampcode.model.Reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReservationService {
    private final List<Reservation> reservations;
    public ReservationService(){
        this.reservations = new ArrayList<>();
    }
    public void registerReservation(Reservation reservation){
        reservations.add(reservation);
    }

    public List<Reservation> filterReservationByDate(String targetDate){
        return reservations.stream()
                .filter(reservation -> reservation .getReservationDate().equals(targetDate))
                .toList();
    }

    public Map<String, Long> countReservationByDate(){
        return reservations.stream()
                .map(reservation -> new ReservationRecord(
                        reservation.getReservationId(),
                        reservation.getGuestName(),
                        reservation.getReservationDate()
                )).collect(Collectors.groupingBy(
                        ReservationRecord::recordDate, Collectors.counting()
                ));
    }

}
