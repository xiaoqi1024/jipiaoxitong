package dao.impl;
import bean.Flight;
import dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class Flightdao implements IFlightDao {

        @Override
        public void insertFlight(Flight flight) throws SQLException {
                String url = "jdbc:oracle:thin:@localhost:1521:orcl";
                String username = "opts";
                String password = "opts1234";
                Connection connection = DriverManager.getConnection(url, username, password);
                String sql = "INSERT INTO flight VALUES(?,?,?,?,?,?,?)";
                PreparedStatement pstmt = connection.prepareStatement(sql);

                pstmt.setString(1,flight.getID());
                pstmt.setString(2,flight.getFlightID());
                pstmt.setString(3,flight.getModels());
                pstmt.setInt(4,flight.getZuoweinum());
                pstmt.setString(5,flight.getLeaveStation());
                pstmt.setString(6,flight.getArriveStation());
                pstmt.setString(7,flight.getDate());
                //System.out.println("dio"+flight);
                pstmt.executeUpdate();

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
