package com.BB2FormacionJacinto.example.models;


import com.BB2FormacionJacinto.commons.models.AuditModel;
import com.BB2FormacionJacinto.example.enums.StateEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="item")
public class Item extends AuditModel {
    @Id
    @Column (name= "id_item")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_item;

    @Column(name = "item_code", unique = true)
    private Long code_product;

    private String description;
    private Double price;
    private StateEnum state;

    @ManyToMany
    @JoinTable(
            name = "item_supplier",
            joinColumns = { @JoinColumn(name = "item_id") },
            inverseJoinColumns = { @JoinColumn(name = "supplier_id") },
            indexes = {
                    @Index(name = "item_supplier_unique", columnList = "item_id, supplier_id", unique = true)
            }
    )
    private List<Supplier> suppliers;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item")
    private List<PriceReduction> priceReductions;

    @Column (name = "creation")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate creation;

    @Column(name="creator")
    private String creator;

    @Override
    public String toString() {
        return "Item{" +
                "id_item=" + id_item +
                ", code_product=" + code_product +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", state=" + state +
                ", creation=" + creation +
                ", creator='" + creator + '\'' +
                '}';
    }

    public Long getId_item() {
        return id_item;
    }

    public void setId_item(Long id_item) {
        this.id_item = id_item;
    }

    public Long getCode_product() {
        return code_product;
    }

    public void setCode_product(Long code_product) {
        this.code_product = code_product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public List<PriceReduction> getPriceReductions() {
        return priceReductions;
    }

    public void setPriceReductions(List<PriceReduction> priceReductions) {
        this.priceReductions = priceReductions;
    }

    public LocalDate getCreation() {
        return creation;
    }

    public void setCreation(LocalDate creation) {
        this.creation = creation;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}
