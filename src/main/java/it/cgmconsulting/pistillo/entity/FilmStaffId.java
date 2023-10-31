package it.cgmconsulting.pistillo.entity;



import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class FilmStaffId implements Serializable {
    private Long film;
    private Long staff;


}

