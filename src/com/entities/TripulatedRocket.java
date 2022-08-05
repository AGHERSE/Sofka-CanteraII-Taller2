package com.entities;

import com.interfaces.MessageInterface;
import com.interfaces.SpeedInterface;

/**
 *
 * Entidad que mantiene la información del cohete tripulado
 * @author AGUSTIN HERNANDEZ
 */
public class TripulatedRocket extends Rocket implements SpeedInterface{

    public TripulatedRocket(){
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
        return "BEEP BOOP. This is the Tripulated Rocket " + this.getRocketName() + 
                " ID: " + this.getRocketId() 
                + ".\nThis is the rocket data:"
                + "\nActual Speed: " + this.getRocketActualSpeed() + "km/h"
                + "\nActual Weight: " + (this.getRocketHeight() + this.getRocketLoad())
                + "\nDistance to the Earth: " + this.getRocket_EarthDistance()
                + "\nNumber of astronauts on board: " + this.getAstronauts()
                + "\nAm I active?: " + this.isActive()
                + "\nBEEP.";
    }

}
