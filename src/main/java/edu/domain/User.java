package edu.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity (name = "users")
public class User implements Serializable {

    @Id
    @SequenceGenerator(name = "id_generator", sequenceName = "id_sequence")
    @GeneratedValue(generator = "id_generator")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
