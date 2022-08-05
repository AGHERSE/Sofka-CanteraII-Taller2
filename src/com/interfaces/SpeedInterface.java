package com.interfaces;

/**
 * Interface to manipulate the rocket speed.
 * @author AGUSTIN HERNANDEZ
 */
public interface SpeedInterface {
    
    /**
     * Acelera 1km/h la velocidad de la nave.
     * Retorna un valor verdadero en caso que se pueda acelerar. En caso que no, se devuelve un valor falso.
     * @return true/false
     */
    public boolean acelerate();
    
    /**
     * Desacelera la nave 1km/h. En caso que sea 0 la velocidad, se retorna un valor false para decir que no se puede desacelerar más.
     * En caso que sea mayor a 0, se desacelera.
     * @return true/false
     */
    public boolean decelerate();
    
    /**
     * Frena completamente la nave. En caso de que la velocidad sea 0, se devuelve un resultado false. En caso contrario, se devuelve un valor true.
     * @return 
     */
    public boolean brake();
}
