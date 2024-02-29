package com.tlp.controller;

import java.time.LocalDate;
import java.util.List;
import com.tlp.model.Destination;
import com.tlp.model.TravelPlan;
import com.tlp.view.TravelItineraryView;

public class TravelItineraryController {
    private TravelItineraryView view;

    public TravelItineraryController() {
        this.view = new TravelItineraryView();
    }

    public void planTrip(List<Destination> destinations, LocalDate startDate, LocalDate endDate, double budget) {
        TravelPlan travelPlan = new TravelPlan(destinations, startDate, endDate, budget);
        if (travelPlan.calculateCost() <= budget) {
            view.displayTravelPlan(travelPlan);
        } else {
            view.displayBudgetExceeded(travelPlan);
        }
    }
}
