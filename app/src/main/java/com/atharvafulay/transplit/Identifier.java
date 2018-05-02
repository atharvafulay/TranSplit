package com.atharvafulay.transplit;

public class Identifier {
    private int internal;
    private String venmo;
    private String google;
    private String samsung;

    /**
     * ----------------------------------------Constructors-----------------------------------------
     */


    /**
     * ----------------------------------------Getters----------------------------------------------
     */

    public int getInternal() {
        return internal;
    }

    public String getVenmo() {
        return venmo;
    }

    public String getGoogle() {
        return google;
    }

    public String getSamsung() {
        return samsung;
    }

    /**
     * ----------------------------------------Setters----------------------------------------------
     */

    public void setInternal(int internal) {
        this.internal = internal;
    }

    public void setVenmo(String venmo) {
        this.venmo = venmo;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public void setSamsung(String samsung) {
        this.samsung = samsung;
    }

}