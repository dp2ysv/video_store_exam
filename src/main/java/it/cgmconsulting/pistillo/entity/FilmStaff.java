package it.cgmconsulting.pistillo.entity;



import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "film_staff")
@Entity
public class FilmStaff {
    @EmbeddedId
    private FilmStaffId id;

    @ManyToOne
    @MapsId("filmId") // nome del campo in FilmStaffId
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @MapsId("staffId") // nome del campo in FilmStaffId
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;


}


