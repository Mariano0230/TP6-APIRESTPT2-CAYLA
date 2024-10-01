package com.example.inicial1.entities;

import com.example.inicial1.entities.audit.Base;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Audited
@Table(name = "persona")
public class Persona extends Base {
    private String nombre;
    private String apellido;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;
}

