package com.entities;

import com.interfaces.SpeedInterface;

/**
 * Entidad que se encarga de manejar las naves propulsoras.
 * @author AGUSTIN HERNANDEZ
 */
public class PropellerRocket extends Rocket implements SpeedInterface{

    public PropellerRocket(){
        super();
    }
    
    
    @Override
    public boolean acelerate() {
        if (this.getRocketActualSpeed() == this.getMaximumSpeed()) {
            return false;
        }
        else{
            this.setRocketActualSpeed(this.getRocketActualSpeed() + 1);
            return true;
        }
    }

    @Override
    public boolean decelerate() {
        if (this.getRocketActualSpeed() == 0) {
            return false;
        }
        else{
            this.setRocketActualSpeed(this.getRocketActualSpeed() - 1);
            return true;
        }
    }

    @Override
    public boolean brake() {
        if (this.getRocketActualSpeed() == 0) {
            return false;
        }
        else{
            this.setRocketActualSpeed(0);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Ahoy! This is the rocket " + this.getRocketName() + 
                " ID: " + this.getRocketId() + ".\nThis is our data:"
                + "\nActual Speed: " + this.getRocketActualSpeed() + "km/h"
                + "\nActual Weight: " + (this.getRocketHeight() + this.getRocketLoad())
                + "\nDistance to the Earth: " + this.getRocket_EarthDistance()
                + "\nAstronauts on board: " + this.getAstronauts()
                + "\nAm I active?: " + this.isActive()
                + "\nStay Safe!";
    }

}
