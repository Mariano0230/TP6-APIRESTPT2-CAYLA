package com.example.inicial1.config;

import jakarta.persistence.*;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionTimestamp;
import org.hibernate.envers.RevisionNumber;
import lombok.Data;
import java.util.Date;

@Entity(name = "CustomRevisionConfigEntity")
@Table(name = "custom_revision_config")
@RevisionEntity
@Data


public class CustomRevisionConfigEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(
            name = "revision_seq",
            sequenceName = "rbac.seq.revision_Id"
    )
    @RevisionNumber
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}
