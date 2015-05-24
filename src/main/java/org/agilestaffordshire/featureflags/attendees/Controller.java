package org.agilestaffordshire.featureflags.attendees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {

    private final org.agilestaffordshire.featureflags.attendees.repository repository;

    @Autowired
    public Controller(org.agilestaffordshire.featureflags.attendees.repository repository) {
        this.repository = repository;
    }

    @RequestMapping("/")
    public ModelAndView index() {

        return new ModelAndView("list", "attendees", repository.getAll());
    }
}
