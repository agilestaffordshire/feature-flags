package org.agilestaffordshire.featureflags.attendees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    private final org.agilestaffordshire.featureflags.attendees.repository repository;
    private final AuditLog auditLog;

    @Autowired
    public Controller(org.agilestaffordshire.featureflags.attendees.repository repository, AuditLog auditLog) {
        this.repository = repository;
        this.auditLog = auditLog;
    }

    @RequestMapping("/")
    public ModelAndView index() {
        Map<String, Object> model = new HashMap<>();

        if (FeatureFlags.AUDITING_VIEWS.isEnabled()) {
            auditLog.audit("viewing attendees");
        }
        model.put("attendees", repository.getAll());
        model.put(FeatureFlags.ADD_ATTENDEE.name(), FeatureFlags.ADD_ATTENDEE.isEnabled());

        return new ModelAndView("list", model);
    }
}
