package ui;

import bean.Flight;
import bll.IFightbll;
import bll.impl.IFightfllsx;
import dao.IFlightDao;
import dao.impl.Flightdao;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class MaiUI {
    public static <IFlightService> void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入相应的数字进行操作");
            System.out.println("按1.录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，推出系统");
            int number = scanner.nextInt();
            int choice = 0;
            if (number == 1) {
                System.out.println("请输入航班信息");

                String id = UUID.randomUUID().toString();
                String newID = id.replace("-", "");
               // System.out.println(newID);
                System.out.print("请输入航班编号:");
                String flightID = scanner.next();
                System.out.print("机型");
                String models = scanner.next();
                System.out.print("座位数");
                int zuoweinum = scanner.nextInt();
                System.out.print("起飞机场");
                String leaveStation = scanner.next();
                System.out.print("到达机场");
                String arriveStation = scanner.next();
                System.out.print("出发时间");
                String date = scanner.next();
                Flight flight = new Flight(newID, models, flightID, zuoweinum, date, leaveStation, arriveStation);
                IFightbll iFightbll = new IFightfllsx();//上转型
                iFightbll.insertFlight(flight);
            }else if(number == 2) {
                System.out.println( "swx");
                Flightdao flightdao = new Flightdao();
                try {
                    Set<Flight> allFlights = flightdao.getAllFlights();
                    /*
                    Set的遍历需要用到迭代器
                     */
                    for (Flight flight : allFlights) {
                        System.out.println(flight);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }


            }
        }

        }
    }