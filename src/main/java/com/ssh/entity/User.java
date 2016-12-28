package com.ssh.entity;

import org.hibernate.annotations.IndexColumn;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @ElementCollection
    @JoinTable(name = "tb_userMap",joinColumns = {@JoinColumn(name = "user_id")})
    @Column(name = "maps_value")
    @MapKeyColumn(name = "map_key")
    private Map<String,String> maps = new HashMap<>();

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    @ElementCollection
    @JoinTable(name = "tb_userList",joinColumns = {@JoinColumn(name = "user_id")})
    @Column(name = "list_value")
    @IndexColumn(name = "list_index")
    private List<String> lists = new ArrayList<>();

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    @ElementCollection
    @JoinTable(name = "tb_userSet",joinColumns = {@JoinColumn(name = "user_id")})
    @Column(name = "set_value")
    private Set<Date> sets = new HashSet<>();

    public Set<Date> getSets() {
        return sets;
    }

    public void setSets(Set<Date> sets) {
        this.sets = sets;
    }
}