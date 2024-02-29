package com.tlp.view;

import java.time.LocalDate;
import java.util.List;
import com.tlp.model.Destination;
import com.tlp.model.TravelPlan;

public class TravelItineraryView {
    public void displayTravelPlan(TravelPlan travelPlan) {
        System.out.println("=================================");
        System.out.println("          TRAVEL ITINERARY        ");
        System.out.println("=================================");
        System.out.println("Start Date: " + travelPlan.getStartDate());
        System.out.println("End Date:   " + travelPlan.getEndDate());
        System.out.println("Budget:     rupees" + travelPlan.getBudget());
        System.out.println("Destinations:");
        List<Destination> destinations = travelPlan.getDestinations();
        for (Destination destination : destinations) {
            System.out.println("  - " + destination.getName());
            System.out.println("    Attractions:");
            List<String> attractions = destination.getAttractions();
            for (String attraction : attractions) {
                System.out.println("      - " + attraction);
            }
            System.out.println("    Accommodations:");
            List<String> accommodations = destination.getAccommodations();
            for (String accommodation : accommodations) {
                System.out.println("      - " + accommodation);
            }
            System.out.println("    Transportation:");
            List<String> transportation = destination.getTransportation();
            for (String transportationMode : transportation) {
                System.out.println("      - " + transportationMode);
            }
            System.out.println("---------------------------------");
        }
        System.out.println("=================================");
    }

    public void displayBudgetExceeded(TravelPlan travelPlan) {
        System.out.println("=================================");
        System.out.println("    BUDGET EXCEEDED DETAILS      ");
        System.out.println("=================================");
        System.out.println("Budget exceeded by: rupees" + (travelPlan.calculateCost() - travelPlan.getBudget()));
        System.out.println("=================================");
    }

    public void planTrip(List<Destination> destinations, LocalDate startDate, LocalDate endDate, double budget) {
        // TODO Auto-generated method stub
    }
}
