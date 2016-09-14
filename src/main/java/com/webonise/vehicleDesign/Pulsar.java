package com.webonise.vehicleDesign;

/**
 * Created by deep on 13/9/16.
 */
public class Pulsar implements IMotorcycle {

    int yearOfMaunfacture;
    String engine;
    int noOfTyres;

    Pulsar() {
        int yearOfMaunfacture=2007;
        String engine="def";
        int noOfTyres=2;
    }

    @Override
    public void hasPedal() {
        System.out.println("Pulsar hasPedal");

    }

    @Override
    public void hasHandlebars() {
        System.out.println("Pulsar hasHandlebars");

    }

    @Override
    public void hasStand() {
        System.out.println("Pulsar hasStand");

    }

    @Override
    public void hasWheels() {
        System.out.println("has" + noOfTyres + "Wheels");

    }

    @Override
    public void hasEngine() {
        System.out.println("Pulsar has " + engine +  " hasEngine");

    }


}
