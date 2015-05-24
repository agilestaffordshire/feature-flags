package org.agilestaffordshire.featureflags.attendees;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    @RequestMapping("/")
    public ModelAndView index() {
        List<Attendee> fakeAttendees = new ArrayList<>();
        Attendee paul = new Attendee("Paul", "Williams");
        fakeAttendees.add(paul);
        return new ModelAndView("list", "attendees", fakeAttendees);
    }
}
