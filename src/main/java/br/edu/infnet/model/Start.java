package br.edu.infnet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="start")
public class Start {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer id_battle;
    private Integer result;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "id_dice")
    private Dice dice;
}
