package com.BB2FormacionJacinto.entities;



import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @Column(name = "id_supplier")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_supplier;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @ManyToMany(mappedBy = "suppliers")
    private List<Item> items;

    public Long getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(Long id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
