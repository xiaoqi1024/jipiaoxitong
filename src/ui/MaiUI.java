package ui;

import bean.Flight;
import bll.IFightbll;
import bll.impl.IFightfllsx;
import dao.IFlightDao;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.UUID;

public class MaiUI {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入相应的数字进行操作");
            System.out.println("1.录入航班信息");
            int number = scanner.nextInt();
            if(number == 1)
            {
                System.out.println("请输入航班信息");
                String id = UUID.randomUUID().toString();
               String newID = id.replace("-","");
                System.out.println(newID);
                System.out.print("请输入航班编号:");
                String flightID = scanner.next();
                System.out.print("机型");
                String models = scanner.next();
                System.out.print("座位数");
                int zuoweinum = scanner.nextInt();
                System.out.print("起飞机场");
                String leaveStation = scanner.next();
                System.out.print("到达机场");
                String arriveStation= scanner.next();
                System.out.print("出发时间");
                String date = scanner.next();
                Flight flight = new Flight(newID,models,flightID,zuoweinum,date,leaveStation,arriveStation);
                IFightbll iFightbll = new IFightfllsx();//上转型
                iFightbll.insertFlight(flight);

                }
            }
        }
    }
