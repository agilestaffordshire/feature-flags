package org.agilestaffordshire.featureflags.attendees;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Controller {


    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("list", null);
    }
}
