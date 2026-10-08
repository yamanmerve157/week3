/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author MERVE
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car = new Car("38ABC123", "Toyota Corolla", 20, 50);

        car.checkStatus();

        car.drive(120);
        car.checkStatus();

        car.refuel(20);
        car.checkStatus();

        car.drive(300);
        car.checkStatus();

        car.drive(200);
        car.checkStatus();

        car.refuel(50);
        car.checkStatus();
    }
    
}
