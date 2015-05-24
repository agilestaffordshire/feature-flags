package org.agilestaffordshire.featureflags.attendees;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HardcodedRepository implements repository {

    @Override
    public List<Attendee> getAll() {
        List<Attendee> attendees = new ArrayList<>();
        Attendee paul = new Attendee("Paul", "Williams");
        attendees.add(paul);
        return attendees;
    }
}
