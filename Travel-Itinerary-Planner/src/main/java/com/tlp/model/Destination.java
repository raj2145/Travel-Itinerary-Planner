package com.tlp.model;

import java.util.List;


import java.util.List;

public class Destination {
    private String name;
    private String location;
    private List<String> attractions;
    private List<String> accommodations;
    private List<String> transportation;

    // getters and setters

    public double calculateDestinationCost() {
        double cost = 0;
        double baseCost = 0;

        // calculate the base cost based on the accommodation type
        switch (accommodations.get(0)) { // Assume only one accommodation type for simplicity
            case "Hotel":
                baseCost = 100;
                break;
            case "Hostel":
                baseCost = 50;
                break;
            case "Airbnb":
                baseCost = 75;
                break;
            default:
                throw new IllegalArgumentException("Invalid accommodation type");
        }

        // calculate the cost based on the number of days of stay
        cost = baseCost * calculateNumberOfDays();

        // add a surcharge based on the location
        if (location.equalsIgnoreCase("ExpensiveCity")) {
            cost *= 1.2;
        } else if (location.equalsIgnoreCase("ModerateCity")) {
            cost *= 1.1;
        }

        return cost;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getAttractions() {
		return attractions;
	}

	public void setAttractions(List<String> attractions) {
		this.attractions = attractions;
	}

	public List<String> getAccommodations() {
		return accommodations;
	}

	public void setAccommodations(List<String> accommodations) {
		this.accommodations = accommodations;
	}

	public List<String> getTransportation() {
		return transportation;
	}

	public void setTransportation(List<String> transportation) {
		this.transportation = transportation;
	}

	private int calculateNumberOfDays() {
        // Your implementation for calculating the number of days
        // based on startDate and endDate
        return 0; // Placeholder, replace with actual logic
    }
}
