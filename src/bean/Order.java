package bean;

import javax.xml.crypto.Data;
import java.util.Set;

/**
 * 订单信息
 */
public class Order {
    private String ID;//然并卵
    private float manType;//乘客类型
    private float jcs;//机场税
    private float ryf;//燃油费
    private float zhx;//航空综合保险
    private float tgx;//退改险
    private float yhq;//优惠券
    private Set<fare> fare;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getManType() {
        return manType;
    }

    public void setManType(float manType) {
        this.manType = manType;
    }

    public float getJcs() {
        return jcs;
    }

    public void setJcs(float jcs) {
        this.jcs = jcs;
    }

    public float getRyf() {
        return ryf;
    }

    public void setRyf(float ryf) {
        this.ryf = ryf;
    }

    public float getZhx() {
        return zhx;
    }

    public void setZhx(float zhx) {
        this.zhx = zhx;
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

    public Set<bean.fare> getFare() {
        return fare;
    }

    public void setFare(Set<bean.fare> fare) {
        this.fare = fare;
    }

    public Order(String ID, float manType, float jcs, float ryf, float zhx, float tgx, float yhq, Set<bean.fare> fare) {
        this.ID = ID;
        this.manType = manType;
        this.jcs = jcs;
        this.ryf = ryf;
        this.zhx = zhx;
        this.tgx = tgx;
        this.yhq = yhq;
        this.fare = fare;
    }
}
