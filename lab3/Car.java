/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author MERVE
 */
public class Car {
     String plateNumber;
    String model;
    double mileage;
    double fuelLevel;
    double tankCapacity;

    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double km) {
        double fuelNeeded = km / 10;

        if (fuelLevel >= fuelNeeded) {
            mileage += km;
            fuelLevel -= fuelNeeded;
            System.out.println("Driving " + km + " km...");
        } else {
            System.out.println("Not enough fuel for this trip!");
        }
    }

    public void refuel(double amount) {
        if (fuelLevel + amount <= tankCapacity) {
            fuelLevel += amount;
            System.out.println("Refueling " + amount + " liters...");
        } else {
            fuelLevel = tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        }
    }

    public void checkStatus() {
        System.out.println("Current mileage: " + mileage + " km");
        System.out.println("Current fuel level: " + fuelLevel + " liters");

        if (fuelLevel < tankCapacity * 0.10) {
            System.out.println("Low fuel warning!");
        }
    
    }}
