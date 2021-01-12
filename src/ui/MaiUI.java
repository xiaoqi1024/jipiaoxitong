package ui;

import bean.Flight;
import bll.IFightbll;
import bll.impl.IFightfllsx;
import dao.IFlightDao;

import java.util.Scanner;
import java.util.UUID;

public class MaiUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入相应的数字进行操作");
            System.out.println("1.录入航班信息");
            int number = scanner.nextInt();
            if(number == 1)
            {
                System.out.println("请输入航班信息");
                String id = UUID.randomUUID().toString();
                System.out.println(id.replace("-", ""));
                System.out.println("请输入航班编号");
                String flightID = scanner.next();
                System.out.println("机型");
                String models = scanner.next();
                System.out.println("座位数");
                int zuoweinum = scanner.nextInt();
                System.out.println("起飞机场");
                String leaveStation = scanner.next();
                System.out.println("到达机场");
                String arriveStation= scanner.next();
                System.out.println("出发时间");
                String date = scanner.next();
                Flight flight = new Flight(models,flightID,zuoweinum,date,leaveStation,arriveStation);
                IFightbll iFightbll = new IFightfllsx();//上转型
                iFightbll.insertFlight(flight);

            }
        }
    }
}
