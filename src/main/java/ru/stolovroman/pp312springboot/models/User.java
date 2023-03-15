package ru.stolovroman.pp312springboot.models;


import javax.persistence.*;

@Entity
@Table(name = "users")
//@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
//    @Column
    private Long id;
    @Column(name = "name", nullable = false, length = 25)
//    @Column(nullable = false, length = 25)
    private String name;
    @Column(name = "surname", nullable = false, length = 25)
//    @Column(nullable = false, length = 25)
    private String surname;
    @Column(name = "age", nullable = true)
//    @Column
    private Byte age;
    @Column(name = "email", nullable = true)
//    @Column
    private String email;

    public User() {

    }

    public User(String name, String surname, Byte age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}
