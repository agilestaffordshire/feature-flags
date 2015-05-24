package org.agilestaffordshire.featureflags;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendeesController {

    @RequestMapping("/")
    public String index() {
        return "hello";
    }
}
