package by.bsuir.pvs.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "passports")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private String series;
    private LocalDate dateOfIssuance;
    private LocalDate validityPeriod;
    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    private Client client;
}
