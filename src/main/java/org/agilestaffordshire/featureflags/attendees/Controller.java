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

    @Autowired
    public Controller(org.agilestaffordshire.featureflags.attendees.repository repository) {
        this.repository = repository;
    }

    @RequestMapping("/")
    public ModelAndView index() {
        Map<String, Object> model = new HashMap<>();

        model.put("attendees", repository.getAll());
        model.put(FeatureFlags.ADD_ATTENDEE.name(), FeatureFlags.ADD_ATTENDEE.isEnabled());

        return new ModelAndView("list", model);
    }
}
