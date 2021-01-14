package bll.impl;

import bean.Flight;
import bll.IFightbll;
import dao.IFlightDao;
import dao.impl.Flightdao;

import java.sql.SQLException;
import java.util.Set;

public class IFightfllsx implements IFightbll {
    IFlightDao iFlightDao;

    public IFightfllsx() {
        iFlightDao =new Flightdao();
    }

    @Override
    public void insertFlight(Flight flight) throws SQLException {
        iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFligts() {

        return iFlightDao.getAllFligts();
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
