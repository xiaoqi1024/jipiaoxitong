package bean;

public class fare {
    private int ID;
    private String name;
    private String cardID;
    private String phone;
    private String birthday;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public fare(int ID, String name, String cardID, String phone, String birthday) {
        this.ID = ID;
        this.name = name;
        this.cardID = cardID;
        this.phone = phone;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "fare{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", cardID='" + cardID + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
