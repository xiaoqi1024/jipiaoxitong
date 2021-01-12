package bll.impl;

import bean.Flight;
import bll.IFightbll;

import java.util.Set;

public class IFightfllsx implements IFightbll {

    @Override
    public void insertFlight(Flight flight) {
        System.out.println(flight);
    }

    @Override
    public Set<Flight> getAllFligts() {
        return null;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
