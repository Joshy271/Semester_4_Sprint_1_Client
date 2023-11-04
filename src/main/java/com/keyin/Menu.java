package com.keyin;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class Menu {
    private HTTPClient httpClient;

    public Menu(HTTPClient httpClient) {
        this.httpClient = httpClient;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. List all Cities");
            System.out.println("2. List all Passengers");
            System.out.println("3. List all Aircrafts");
            System.out.println("4. List all Airports");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listAllCities();
                    break;
                case 2:
                    listAllPassengers();
                    break;
                case 3:
                    listAllAircrafts();
                    break;
                case 4:
                    listAllAirports();
                    break;
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private void listAllCities() {
        // Implement logic to list all cities.
        String cityData = httpClient.fetchCityData(); // Example: Fetch city data using the HTTPClient.
        System.out.println("List of all Cities:");
        System.out.println(cityData); // Display city data here.
    }

    private void listAllPassengers() {
        // Implement logic to list all passengers.
        String passengerData = httpClient.fetchPassengerData(); // Example: Fetch passenger data using the HTTPClient.
        System.out.println("List of all Passengers:");
        System.out.println(passengerData); // Display passenger data here.
    }

    private void listAllAircrafts() {
        // Implement logic to list all aircrafts.
        String aircraftData = httpClient.fetchAircraftData(); // Example: Fetch aircraft data using the HTTPClient.
        System.out.println("List of all Aircrafts:");
        System.out.println(aircraftData); // Display aircraft data here.
    }

    private void listAllAirports() {
        // Implement logic to list all airports.
        String airportData = httpClient.fetchAirportData(); // Example: Fetch airport data using the HTTPClient.
        System.out.println("List of all Airports:");
        System.out.println(airportData); // Display airport data here.
    }
}



