package rest.menu.model;

import javax.persistence.*;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phone_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
