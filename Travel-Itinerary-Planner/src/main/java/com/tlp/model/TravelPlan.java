package com.tlp.model;

import java.time.LocalDate;
import java.util.List;

public class TravelPlan {
    private List<Destination> destinations;
    private LocalDate startDate;
    private LocalDate endDate;
    private double budget;

    public TravelPlan(List<Destination> destinations, LocalDate startDate, LocalDate endDate, double budget) {
        this.destinations = destinations;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
    }

    public double calculateCost() {
        double totalCost = 0;
        for (Destination destination : destinations) {
            totalCost += destination.calculateDestinationCost();
        }
        return totalCost;
    }

    // getters and setters

    public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public List<Destination> getDestinations() {
        return destinations;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public double getBudget() {
        return budget;
    }
}
