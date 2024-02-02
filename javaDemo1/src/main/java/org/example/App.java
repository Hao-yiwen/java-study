package org.example;

import org.example.yiwen.CombunstionEngine;
import org.example.yiwen.ElectricEngine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        CombustionCar combustionCar = new CombustionCar();
//        combustionCar.start();
//        ElectricCar electricCar = new ElectricCar();
//        electricCar.start();

        CombunstionEngine combustionEngine = new CombunstionEngine();
        Car combustionCar = new Car(combustionEngine);
        combustionCar.start();
        ElectricEngine electricEngine = new ElectricEngine();
        Car electricCar = new Car(electricEngine);
        electricCar.start();

    }
}
