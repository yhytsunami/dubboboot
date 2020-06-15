package entity;

import java.io.Serializable;

/**
 * Created By yhytsunami
 * Date: 2020/4/3
 * Time: 11:14
 * Description:
 */
public class Honey implements Serializable {
    private String id;

    private String name ;

    private String price;

    private String address;

    private String info;

    private String contact;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Honey{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", address='" + address + '\'' +
                ", info='" + info + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
