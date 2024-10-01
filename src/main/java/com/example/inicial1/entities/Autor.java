package com.example.inicial1.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "autor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited

public class Autor extends Base{
    @Column(name ="nombre")
    private string nombre;
    @Column(name ="apellido")
    private string apellido;
    @Column(name = "biografia", length = 1500)
    private string biografia;


}
