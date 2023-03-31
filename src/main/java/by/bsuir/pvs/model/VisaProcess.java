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
@Table(name = "processes")
public class VisaProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Client client;
    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Passport password;
    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Country country;
    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Visa visa;
    private LocalDate startDate;
    private String status;
}
