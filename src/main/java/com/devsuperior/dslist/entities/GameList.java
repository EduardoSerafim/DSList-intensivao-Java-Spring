package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "GameList")
@Table(name = "tb_game_list")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class GameList {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
