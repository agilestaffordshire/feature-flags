package org.agilestaffordshire.featureflags.attendees;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;

@Service
public class NotFinishedAuditLog implements AuditLog {

    @Override
    public void audit(String message) {
        throw new NotImplementedException("This will takes ages!!");
    }
}
