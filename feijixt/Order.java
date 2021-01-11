package feijixt;

import javax.xml.crypto.Data;

public class Order {
    private String ID;//然并卵
    private String name;//乘客姓名
    private String cardID;//身份证
    private Data brithday;//出生日期
    private float price;//票型价钱
    private float airportTax;//机场税

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public Data getBrithday() {
        return brithday;
    }

    public void setBrithday(Data brithday) {
        this.brithday = brithday;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAirportTax() {
        return airportTax;
    }

    public void setAirportTax(float airportTax) {
        this.airportTax = airportTax;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getHkx() {
        return hkx;
    }

    public void setHkx(float hkx) {
        this.hkx = hkx;
    }

    public float getTgx() {
        return tgx;
    }

    public void setTgx(float tgx) {
        this.tgx = tgx;
    }

    public float getYhq() {
        return yhq;
    }

    public void setYhq(float yhq) {
        this.yhq = yhq;
    }

    private float ryf;//燃油费
    private float hkx;//航空综合保险
    private float tgx;//机票退该保险
    private float yhq;//优惠券


    public Order() {
    }
}
