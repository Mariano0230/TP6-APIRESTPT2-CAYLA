package com.example.inicial1.entities.audit;
import com.example.inicial1.entities.audit.CustomRevisionListener;
import org.hibernate.envers.RevisionListener;

public class CustomRevisionListener implements RevisionListener {
    @Override
    public void newRevision(Object revisionEntity) {
        // Lógica de auditoría
    }
}
