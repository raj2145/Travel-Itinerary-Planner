package com.tlp.controller;

import com.tlp.model.Destination;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Sample data for destinations
            List<Destination> destinations = new ArrayList<>();

            // Number of cities to plan
            System.out.print("Enter the number of cities to plan: ");
            int numberOfCities = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            for (int i = 1; i <= numberOfCities; i++) {
                Destination city = new Destination();

                System.out.println("Enter details for City " + i + ":");

                // City Name
                System.out.print("Name: ");
                city.setName(scanner.nextLine());

                // Location
                System.out.print("Location (ExpensiveCity/ModerateCity): ");
                city.setLocation(scanner.nextLine());

                // Attractions (comma-separated)
                System.out.print("Attractions : ");
                String attractionsInput = scanner.nextLine();
                List<String> attractions = Arrays.asList(attractionsInput.split(","));
                city.setAttractions(attractions);

                // Accommodations (comma-separated)
                System.out.print("Accommodations Airbnb ,Hotel,Hostel=");
                String accommodationsInput = scanner.nextLine();
                List<String> accommodations = Arrays.asList(accommodationsInput.split(","));
                city.setAccommodations(accommodations);

                // Transportation (comma-separated)
                System.out.print("Transportation (comma-separated): ");
                String transportationInput = scanner.nextLine();
                List<String> transportation = Arrays.asList(transportationInput.split(","));
                city.setTransportation(transportation);

                // Add city to the list of destinations
                destinations.add(city);
            }

            // Dates
            System.out.print("Enter the start date (yyyy-MM-dd): ");
            LocalDate startDate = LocalDate.parse(scanner.nextLine());

            System.out.print("Enter the end date (yyyy-MM-dd): ");
            LocalDate endDate = LocalDate.parse(scanner.nextLine());

            // Budget
            System.out.print("Enter the budget: ");
            double budget = scanner.nextDouble();

            // Creating controller and planning the trip
            TravelItineraryController controller = new TravelItineraryController();
            controller.planTrip(destinations, startDate, endDate, budget);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Close the scanner in the finally block to ensure it is always closed
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
