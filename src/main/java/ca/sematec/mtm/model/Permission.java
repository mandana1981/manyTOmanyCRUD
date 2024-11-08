package ca.sematec.mtm.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PERMISSION")
public class Permission {
    @Id
    @GeneratedValue
    @Column(name = "PERMISSION_ID")
    private int id;
    @Column(name = "PERMISSION_NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "permissions")
    private List<Role> roles=new ArrayList<>();

    public Permission() {}

    public Permission(int id, String name) {
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
