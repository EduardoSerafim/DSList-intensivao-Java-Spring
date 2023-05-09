package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Game")
@Table(name = "tb_games")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode( of = "id")
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(name = "game_year")
    private Integer year;

    private String  genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

}
