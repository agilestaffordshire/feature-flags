package org.agilestaffordshire.featureflags.attendees;

public interface AuditLog {
    void audit(String message);
}