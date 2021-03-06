package VehicleHireApp;

import au.edu.swin.vehicle.Vehicle;
import au.edu.swin.vehicle.VehicleType;
import java.util.ArrayList;
import java.util.Scanner;

public class VehicleHireApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Create the vehicle types
        VehicleType sedan = new VehicleType("SEDAN", "A standard sedan", 4);
        VehicleType limo6 = new VehicleType("LIMO6", "A six seater limo", 6);
        VehicleType limo8 = new VehicleType("LIMO8", "An eight seater limo", 8);
// Create the vehicles
        ArrayList<Vehicle> vehicles = new ArrayList();
        vehicles.add(new Vehicle("Ed's Holden Caprice", "Silver", sedan, 2002));
        vehicles.add(new Vehicle("John's Mercedes C200", "Black", sedan, 2005));
        vehicles.add(new Vehicle("Guy's Volvo 244 DL", "Blue", sedan, 1976));
        vehicles.add(new Vehicle("Sasco's Ford Limo", "White", limo6, 2014));
        vehicles.add(new Vehicle("Peter's Ford Limo", "White", limo6, 2004));
        vehicles.add(new Vehicle("Robert's Ford Limo", "White", limo8, 2003));
        System.out.println("\n\nList of vehicles in system:");
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getName() + " " + vehicle.getColour() + " (" + vehicle.getType().getDescription() +  ") "  + vehicle.getYear());
        }
        String typeCode = args[0];
        System.out.println("\n\nList of vehicle of type " + typeCode);
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().getCode().equals(typeCode)) {
                System.out.println(vehicle);
            }
        }

        System.out.println("It will display a list of vehicle type you choose");
        System.out.println("1: SEDAN");
        System.out.println("2: LIMO6");
        System.out.println("3: LIMO8");
        System.out.println("4: Exit");

        while (true) {
            Scanner optionInput = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Please select an option (1-4):");
            int userOption = Integer.parseInt(optionInput.nextLine());
            if (userOption == 1)  {
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getType().getCode()  == "SEDAN") {
                        System.out.println(vehicle.getName() + " " + vehicle.getColour() + " (" + vehicle.getType().getDescription() +  ") "  + vehicle.getYear());
                    }
                }
            } else if (userOption == 2) {
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getType().getCode()  == "LIMO6") {
                        System.out.println(vehicle.getName() + " " + vehicle.getColour() + " (" + vehicle.getType().getDescription() +  ") "  + vehicle.getYear());
                    }
                }
            } else if (userOption == 3) {
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getType().getCode()  == "LIMO8") {
                        System.out.println(vehicle.getName() + " " + vehicle.getColour() + " (" + vehicle.getType().getDescription() +  ") "  + vehicle.getYear());
                    }
                }
            } else if (userOption == 4) {
                System.exit(0);
            }
        }
    }
}
