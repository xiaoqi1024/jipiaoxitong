package bean;

import java.sql.Date;

public class Flight {
    private String models;//机型
    private String flightID;//飞机编号
    private int zuoweinum;//当前座位
    private String date;//出发时间
    private String leaveStation;//起飞站点
    private String arriveStation;//到达站点
    //private float price;


    @Override
    public String toString() {
        return "Flight{" +
                "机型='" + models + '\'' +
                ", 飞机编号='" + flightID + '\'' +
                ", 座位数=" + zuoweinum +
                ", 出发时间='" + date + '\'' +
                ", 起飞时间='" + leaveStation + '\'' +
                ", 到达时间='" + arriveStation + '\'' +
                '}';
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }



    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public Flight(String models, String flightID, int zuoweinum, String date, String leaveStation, String arriveStation) {
        this.models = models;
        this.flightID = flightID;
        this.zuoweinum = zuoweinum;
        this.date = date;
        this.leaveStation = leaveStation;
        this.arriveStation = arriveStation;
    }

    public int getZuoweinum() {
        return zuoweinum;
    }

    public void setZuoweinum(int zuoweinum) {
        this.zuoweinum = zuoweinum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLeaveStation() {
        return leaveStation;
    }

    public void setLeaveStation(String leaveStation) {
        this.leaveStation = leaveStation;
    }

    public String getArriveStation() {
        return arriveStation;
    }

    public void setArriveStation(String arriveStation) {
        this.arriveStation = arriveStation;
    }

}
