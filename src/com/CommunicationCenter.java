/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.entities.NoTripulationRocket;
import com.entities.PropellerRocket;
import com.entities.TripulatedRocket;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Principal que nos va a permitir realizar la creación de diferentes naves, ver mensajes, acelerar y desacelerar.
 * @author AGUSTIN HERNANDEZ
 */
public class CommunicationCenter {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        ArrayList<NoTripulationRocket> noTripulatedRocketList = new ArrayList<>();
        ArrayList<TripulatedRocket> tripulatedRocketList = new ArrayList<>();
        ArrayList<PropellerRocket> propellerRocketList = new ArrayList<>();
        int option = 0;
        int shipOption = 0;
        String pause = "";
        String idRocket = "";
        
        do {            
            System.out.println("Hi! Which action do you want to do? \n1) Add a new ship. \n2) Manipulate the speed of a Ship. \n3) Get the information. \n0) Exit.");
            option = t.nextInt();
            
            switch (option) {
                case 0:
                    System.out.println("See you next time.");
                    break;
                
                case 1:
                    firstOption(noTripulatedRocketList, tripulatedRocketList, propellerRocketList);
                    break;
                
                case 2:
                    secondOption(noTripulatedRocketList, tripulatedRocketList, propellerRocketList);
                    break;
                case 3:
                    thirdOption(noTripulatedRocketList, tripulatedRocketList, propellerRocketList);
                    break;
                default:
                    System.out.println("No valid action. \nPress any button.");
                    pause = t.next();
                    break;
            }
            
        } while (option != 0);
    }
    
    
    private static void getRocketData(NoTripulationRocket newRocket){
        Scanner t = new Scanner(System.in);
        System.out.println("Insert the ID of the No Tripulated Ship: ");
        newRocket.setRocketId(t.next());
        System.out.println("Insert the name of the No Tripulated Ship: ");
        newRocket.setRocketName(t.next());
        System.out.println("Insert the maximum speed of the No Tripulated Ship: (km/h)");
        newRocket.setMaximumSpeed(t.nextDouble());
        System.out.println("Insert the actual weight of the No Tripulated Ship: ");
        newRocket.setRocketWeight(t.nextDouble());
        System.out.println("Insert the actual height of the No Tripulated Ship: ");
        newRocket.setRocketHeight(t.nextDouble());
        System.out.println("Insert the distance from the earth to the No Tripulated Ship: ");
        newRocket.setRocket_EarthDistance(t.nextDouble());
        System.out.println("Insert the number of cameras of the No Tripulated Ship: ");
        newRocket.setRocketCameras(t.nextInt());
        System.out.println("Is the no tripulated ship active? (true/false): ");
        newRocket.setActive(t.nextBoolean());
    }
    
    private static void getRocketData(TripulatedRocket newRocket){
        Scanner t = new Scanner(System.in);
        System.out.println("Insert the ID of the Tripulated Ship: ");
        newRocket.setRocketId(t.next());
        System.out.println("Insert the name of the Tripulated Ship: ");
        newRocket.setRocketName(t.next());
        System.out.println("Insert the maximum speed of the Tripulated Ship: (km/h)");
        newRocket.setMaximumSpeed(t.nextDouble());
        System.out.println("Insert the actual weight of the Tripulated Ship: ");
        newRocket.setRocketWeight(t.nextDouble());
        System.out.println("Insert the actual height of the Tripulated Ship: ");
        newRocket.setRocketHeight(t.nextDouble());
        System.out.println("Insert the distance from the earth to the Tripulated Ship: ");
        newRocket.setRocket_EarthDistance(t.nextDouble());
        System.out.println("Insert the number of cameras of the Tripulated Ship: ");
        newRocket.setRocketCameras(t.nextInt());
        System.out.println("How many astronauts are on board? ");
        newRocket.setAstronauts(t.nextInt());
        System.out.println("Is the tripulated ship active? (true/false): ");
        newRocket.setActive(t.nextBoolean());
    }
    
    private static void getRocketData(PropellerRocket newRocket){
        Scanner t = new Scanner(System.in);
        System.out.println("Insert the ID of the Propelled Ship: ");
        newRocket.setRocketId(t.next());
        System.out.println("Insert the name of the Propelled Ship: ");
        newRocket.setRocketName(t.next());
        System.out.println("Insert the maximum speed of the Propelled Ship: (km/h)");
        newRocket.setMaximumSpeed(t.nextDouble());
        System.out.println("Insert the actual weight of the Propelled Ship: ");
        newRocket.setRocketWeight(t.nextDouble());
        System.out.println("Insert the actual height of the Propelled Ship: ");
        newRocket.setRocketHeight(t.nextDouble());
        System.out.println("Insert the distance from the earth to the Propelled Ship: ");
        newRocket.setRocket_EarthDistance(t.nextDouble());
        System.out.println("Insert the number of cameras of the Propelled Ship: ");
        newRocket.setRocketCameras(t.nextInt());
        System.out.println("How many astronauts are on board? ");
        newRocket.setAstronauts(t.nextInt());
        System.out.println("Is the tripulated ship active? (true/false): ");
        newRocket.setActive(t.nextBoolean());
    }
    
    private static void showInformation(String information) {
        System.out.println(information);
    }
    
    private static void firstOption(ArrayList<NoTripulationRocket> noTripulatedRocketList, ArrayList<TripulatedRocket> tripulatedRocketList, ArrayList<PropellerRocket> propellerRocketList){
        Scanner t = new Scanner(System.in);
        int shipOption = 0;
        String pause = "";
        System.out.println("Which kind of ship do you want to add? \n1) No Tripulated Ship. \n2) Tripulated Ship. \n3)Propeller Ship.");
                    shipOption = t.nextInt();
                    switch (shipOption) {
                        case 1:
                            NoTripulationRocket newNTRocket = new NoTripulationRocket();
                            getRocketData(newNTRocket);
                            noTripulatedRocketList.add(newNTRocket);
                            break;
                        case 2:
                            TripulatedRocket newTRocket = new TripulatedRocket();
                            getRocketData(newTRocket);
                            tripulatedRocketList.add(newTRocket);
                            break;
                        case 3:
                            PropellerRocket newPRocket = new PropellerRocket();
                            getRocketData(newPRocket);
                            propellerRocketList.add(newPRocket);
                            break;
                        default:
                            System.out.println("Not Valid Action.");
                            break;
                    }
                    System.out.println("Press Any Button.");
                    pause = t.next();
    }
    
    private static void secondOption(ArrayList<NoTripulationRocket> noTripulatedRocketList, ArrayList<TripulatedRocket> tripulatedRocketList, ArrayList<PropellerRocket> propellerRocketList){
        Scanner t = new Scanner(System.in);
        System.out.println("Which kind of ship do you want to know the information? \n1)No tripulated ships. \n2)Tripulated Ships. \n3) Propelled Ships.");
        int shipOption = t.nextInt();
        String idRocket = "";
        switch (shipOption) {
            case 1:
                System.out.println("Give the ship's ID: ");
                idRocket = t.next();
                for (NoTripulationRocket noTripulationRocket : noTripulatedRocketList) {
                    if (noTripulationRocket.getRocketId().toLowerCase().equals(idRocket.toLowerCase())) {
                        System.out.println("Do you want to acelerate, deacelerate or brake? \n1) Accelerate. \n2) Deaccelerate. \n3) Brake.");
                        shipOption = t.nextInt();
                        if (shipOption == 1) {
                            if (noTripulationRocket.acelerate()) {
                                System.out.println("Acelerando... " + noTripulationRocket.getRocketActualSpeed() + "km/h");
                            }
                            else{
                                System.out.println("Error. Cannot accelerate.");
                            }
                        }
                        else if (shipOption == 2) {
                            if (noTripulationRocket.decelerate()) {
                                System.out.println("Desacelerando... " + noTripulationRocket.getRocketActualSpeed() + "km/h");
                            }
                            else{
                                System.out.println("Error. Cannot get a lower speed. " + noTripulationRocket.getRocketActualSpeed());
                            }
                        }
                        else if (shipOption == 3) {
                            if (noTripulationRocket.brake()) {
                                System.out.println("Frenado... " + noTripulationRocket.getRocketActualSpeed() + "km/h");
                            }
                            else{
                                System.out.println("Error. The ship hasn't speed before the action. " + noTripulationRocket.getRocketActualSpeed());
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Give the ship's ID: ");
                idRocket = t.next();
                for (TripulatedRocket tripulationRocket : tripulatedRocketList) {
                    if (tripulationRocket.getRocketId().toLowerCase().equals(idRocket.toLowerCase())) {
                        System.out.println("Do you want to acelerate, deacelerate or brake? \n1) Accelerate. \n2) Deaccelerate. \n3) Brake.");
                        shipOption = t.nextInt();
                        if (shipOption == 1) {
                            if (tripulationRocket.acelerate()) {
                                System.out.println("Acelerando... " + tripulationRocket.getRocketActualSpeed() + "km/h");
                            }
                            else{
                                System.out.println("Error. Cannot accelerate.");
                            }
                        }
                        else if (shipOption == 2) {
                            if (tripulationRocket.decelerate()) {
                                System.out.println("Desacelerando... " + tripulationRocket.getRocketActualSpeed() + "km/h");
                            }
                            else{
                                System.out.println("Error. Cannot get a lower speed. " + tripulationRocket.getRocketActualSpeed());
                            }
                        }
                        else if (shipOption == 3) {
                            if (tripulationRocket.brake()) {
                                System.out.println("Frenado... " + tripulationRocket.getRocketActualSpeed() + "km/h");
                            }
                            else{
                                System.out.println("Error. The ship hasn't speed before the action. " + tripulationRocket.getRocketActualSpeed());
                            }
                        }
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("Give the ship's ID: ");
                idRocket = t.next();
                for (PropellerRocket propelledShip : propellerRocketList) {
                    if (propelledShip.getRocketId().toLowerCase().equals(idRocket.toLowerCase())) {
                        System.out.println("Do you want to acelerate, deacelerate or brake? \n1) Accelerate. \n2) Deaccelerate. \n3) Brake.");
                        shipOption = t.nextInt();
                        if (shipOption == 1) {
                            if (propelledShip.acelerate()) {
                                System.out.println("Acelerando... " + propelledShip.getRocketActualSpeed() + "km/h");
                            }
                            else{
                                System.out.println("Error. Cannot accelerate.");
                            }
                        }
                        else if (shipOption == 2) {
                            if (propelledShip.decelerate()) {
                                System.out.println("Desacelerando... " + propelledShip.getRocketActualSpeed() + "km/h");
                            }
                            else{
                                System.out.println("Error. Cannot get a lower speed. " + propelledShip.getRocketActualSpeed());
                            }
                        }
                        else if (shipOption == 3) {
                            if (propelledShip.brake()) {
                                System.out.println("Frenado... " + propelledShip.getRocketActualSpeed() + "km/h");
                            }
                            else{
                                System.out.println("Error. The ship hasn't speed before the action. " + propelledShip.getRocketActualSpeed());
                            }
                        }
                        break;
                    }
                }
            default:
                System.out.println("Not Valid Action.");
                break;
        }
        System.out.println("Press Any Button.");
        String pause = t.next();
    }
    
    private static void thirdOption(ArrayList<NoTripulationRocket> noTripulatedRocketList, ArrayList<TripulatedRocket> tripulatedRocketList, ArrayList<PropellerRocket> propellerRocketList){
        
        Scanner t = new Scanner(System.in);
        System.out.println("Which kind of ship do you want to know the information? \n1)No tripulated ships. \n2)Tripulated Ships. \n3) Propelled Ships.");
        int shipOption = t.nextInt();
        String idRocket = "";
        switch (shipOption) {
            case 1:
                System.out.println("Give the ship's ID: ");
                idRocket = t.next();
                for (NoTripulationRocket noTripulationRocket : noTripulatedRocketList) {
                    if (noTripulationRocket.getRocketId().toLowerCase().equals(idRocket.toLowerCase())) {
                        showInformation(noTripulationRocket.toString());
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Give the ship's ID: ");
                idRocket = t.next();
                for (TripulatedRocket tripulationRocket : tripulatedRocketList) {
                    if (tripulationRocket.getRocketId().toLowerCase().equals(idRocket.toLowerCase())) {
                        showInformation(tripulationRocket.toString());
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("Give the ship's ID: ");
                idRocket = t.next();
                for (PropellerRocket propelledShip : propellerRocketList) {
                    if (propelledShip.getRocketId().toLowerCase().equals(idRocket.toLowerCase())) {
                        showInformation(propelledShip.toString());
                        break;
                    }
                }
            default:
                System.out.println("Not Valid Action.");
                break;
        }
        System.out.println("Press Any Button.");
        String pause = t.next();
    }
}
