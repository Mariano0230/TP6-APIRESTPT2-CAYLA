package com.example.inicial1.config;

import org.hibernate.envers.RevisionListener;

public class CustomRevisionListenerConfig implements RevisionListener {
    @Override
    public void newRevision(Object revisionEntity) {
        // Lógica de auditoría
    }
}
