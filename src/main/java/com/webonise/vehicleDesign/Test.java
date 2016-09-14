package com.webonise.vehicleDesign;

/**
 * Created by deep on 13/9/16.
 */
public class Test {
    public static void main(String args[])
    {
        ICar FerrariRef = new Ferrari(); //Type Compatibility
        IMotorcycle motorCycleRef = new Pulsar(); //Type Compatibility
        FerrariRef.hasWheels();
        motorCycleRef.hasHandlebars();


    }

}
