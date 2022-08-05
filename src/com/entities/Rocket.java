package com.entities;

/**
 * Entidad que será la abstracta.
 * @author AGUSTIN HERNANDEZ
 */

public abstract class Rocket {
    
    private String rocketId;
    private String rocketName;
    private double maximumSpeed;
    private double rocketActualSpeed;
    private double rocketWeight;
    private double rocketLoad;
    private double rocketHeight;
    private double rocketAcumulationDistance;
    private double rocket_EarthDistance;
    private int rocketCameras;
    private int astronauts;
    private boolean active;
    
    public Rocket(){
        rocketId = "";
        rocketName = "";
        maximumSpeed = 0;
        rocketActualSpeed = 0;
        rocketWeight = 0;
        rocketLoad = 0;
        rocketHeight = 0;
        rocketAcumulationDistance = 0;
        rocket_EarthDistance = 0;
        rocketCameras = 0;
        astronauts = 0;
        active = false;
    }

    public String getRocketId() {
        return rocketId;
    }

    public void setRocketId(String rocketId) {
        this.rocketId = rocketId;
    }

    public String getRocketName() {
        return rocketName;
    }

    public void setRocketName(String rocketName) {
        this.rocketName = rocketName;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getRocketActualSpeed() {
        return rocketActualSpeed;
    }

    public void setRocketActualSpeed(double rocketActualSpeed) {
        this.rocketActualSpeed = rocketActualSpeed;
    }

    
    public double getRocketWeight() {
        return rocketWeight;
    }

    public void setRocketWeight(double rocketWeight) {
        this.rocketWeight = rocketWeight;
    }

    public double getRocketLoad() {
        return rocketLoad;
    }

    public void setRocketLoad(double rocketLoad) {
        this.rocketLoad = rocketLoad;
    }

    public double getRocketHeight() {
        return rocketHeight;
    }

    public void setRocketHeight(double rocketHeight) {
        this.rocketHeight = rocketHeight;
    }

    public double getRocketAcumulationDistance() {
        return rocketAcumulationDistance;
    }

    public void setRocketAcumulationDistance(double rocketAcumulationDistance) {
        this.rocketAcumulationDistance = rocketAcumulationDistance;
    }

    public double getRocket_EarthDistance() {
        return rocket_EarthDistance;
    }

    public void setRocket_EarthDistance(double rocket_EarthDistance) {
        this.rocket_EarthDistance = rocket_EarthDistance;
    }

    public int getRocketCameras() {
        return rocketCameras;
    }

    public void setRocketCameras(int rocketCameras) {
        this.rocketCameras = rocketCameras;
    }

    public int getAstronauts() {
        return astronauts;
    }

    public void setAstronauts(int astronauts) {
        this.astronauts = astronauts;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
     
    
}
