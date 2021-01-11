package feijixt;

import java.util.Date;

public class Flight {
    private String models;//机型
    private Date date;//日期
    private String leaveStation;//起飞站点
    private String arriveStation;//到达站点
   //private float price;

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public java.sql.Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(java.sql.Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public java.sql.Date getArrive() {
        return arrive;
    }

    public void setArrive(java.sql.Date arrive) {
        this.arrive = arrive;
    }

    private  float price;//价格
    private java.sql.Date leaveTime;//起飞时间
    private java.sql.Date arrive;//到达时间



}
