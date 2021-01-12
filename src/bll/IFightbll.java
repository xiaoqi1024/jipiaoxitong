package bll;

import bean.Flight;

import java.util.Set;

public interface IFightbll {
    void insertFlight(Flight flight);
    Set<Flight> getAllFligts();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String departureAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirport);
    void updateFlight(Flight flight);
}
