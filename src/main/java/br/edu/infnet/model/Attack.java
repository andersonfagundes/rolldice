package br.edu.infnet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="attack")
public class Attack {
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
