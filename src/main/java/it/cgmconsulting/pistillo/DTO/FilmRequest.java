package it.cgmconsulting.pistillo.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class FilmRequest {

    private String title;
    private String description;
    private int releaseYear;

}

