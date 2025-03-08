package com.Address.AddressBook.Model;



import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
//    private String address;

    public Contact() {}

    public Contact(Long id, String email, String phone) {
        this.id = id;
        this.email = email;
        this.phone = phone;
//        this.address = address;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

//    public String getAddress() { return address; }
//    public void setAddress(String address) { this.address = address; }
}
