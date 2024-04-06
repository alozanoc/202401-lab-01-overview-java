package pe.edu.upao.transaccionales.lab1.hampcode.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Reservation {
    private String reservationId;
    private String guestName;
    private String reservationDate;
}
