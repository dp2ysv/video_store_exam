package it.cgmconsulting.pistillo.DTO;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class RentalRequest {

    private Long filmId;
    private Long storeId;
    private LocalDate rentalDate;
    private LocalDate returnDate;
    @Getter
    private Object rentalId;

    public RentalRequest() {
    }

    public RentalRequest(Long filmId, Long storeId, LocalDate rentalDate, LocalDate returnDate) {
        this.filmId = filmId;
        this.storeId = storeId;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
    }


}

