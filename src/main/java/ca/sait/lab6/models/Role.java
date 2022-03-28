package ca.sait.lab6.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;
/**
 * Represents a role
 * @author Kevin Linde
 */

@Entity
@Table(name = "role")
@NamedQueries({
    @NamedQuery(name = "RolefindAll", query = "SELECT r FROM Role r")
})
public class Role implements Serializable {
    @Id
    @Basic
    @Column(name = "role_id")
    private int id;
    
    
    @Column(name = "role_name")
    private String name;
    
    @OneToMany
    private List<User> user;
    
    public Role() {
        
    }
    
    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
