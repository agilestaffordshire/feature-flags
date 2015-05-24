package org.agilestaffordshire.featureflags.attendees;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public enum FeatureFlags {
    ADD_ATTENDEE, AUDITING_VIEWS;

    public boolean isEnabled() {
        switch(this) {
            case ADD_ATTENDEE:
                return isOnNarnia();
            case AUDITING_VIEWS:
                return isOnMordor();
        }
        return true;
    }

    private boolean isOnNarnia() {
        return isOnHost("narnia");
    }

    public boolean isOnMordor() {
        return isOnHost("mordor");
    }

    private boolean isOnHost(String narnia) {
        try {
            return Inet4Address.getLocalHost().getHostName().toLowerCase().startsWith(narnia);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return false;
        }
    }


}
