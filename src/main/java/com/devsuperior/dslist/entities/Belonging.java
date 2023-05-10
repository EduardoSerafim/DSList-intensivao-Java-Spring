package com.devsuperior.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "Belonging")
@Table(name = "tb_belonging")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging(Game game, GameList list, Integer position){
        this.id.setGame(game);
        this.id.setList(list);
        this.position = position;

    }
}
