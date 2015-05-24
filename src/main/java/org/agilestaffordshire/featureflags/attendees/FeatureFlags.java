package org.agilestaffordshire.featureflags.attendees;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public enum FeatureFlags {
    ADD_ATTENDEE;

    public boolean isEnabled() {
        return isOnNarnia();
    }

    private boolean isOnNarnia() {
        try {
            return Inet4Address.getLocalHost().getHostName().toLowerCase().startsWith("narnia");
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return false;
        }
    }
}
