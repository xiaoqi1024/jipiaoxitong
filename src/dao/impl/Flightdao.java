package dao.impl;
import bean.Flight;
import dao.IFlightDao;

import java.sql.*;
import java.util.HashSet;
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
        public Set<Flight> getAllFlights() throws SQLException {
                Set<Flight> allFlights = new HashSet<Flight>();//容器
                String url = "jdbc:oracle:thin:@localhost:1521:orcl";
                String username = "opts";
                String password = "opts1234";
                Connection conn = DriverManager.getConnection(url, username, password);
                String sql = "SELECT * FROM flight";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {

                        String id = rs.getString("ID");
                        String flightId = rs.getString("FLIGHT_ID");
                        String planeType = rs.getString("PLANE_TYPE");
                        int currentSeatsNum = rs.getInt("TOTAL_SEATS_NUM");
                        String departureAirPort = rs.getString("DEPARTURE_AIRPORT");
                        String destinationAirPort = rs.getString("DESTINATION_AIRPORT");
                        String departureTime = rs.getString("DEPARTURE_TIME");
                        Flight flight = new Flight(id, flightId, planeType, currentSeatsNum,
                                departureAirPort, destinationAirPort, departureTime);
                        allFlights.add(flight);
                }
                return allFlights;
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
