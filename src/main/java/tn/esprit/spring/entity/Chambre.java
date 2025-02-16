package tn.esprit.spring.entity;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.spring.entity.TypeChambre;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;

    private Long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}
