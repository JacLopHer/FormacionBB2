package com.BB2FormacionJacinto.example.models;

import com.BB2FormacionJacinto.commons.models.AuditModel;
import com.fasterxml.jackson.annotation.JsonFormat;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "price_reduction")
public class PriceReduction extends AuditModel {

    @Id
    @Column(name = "id_price_reduction")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id_price_reduction;

    @Column(name = "reduced_price")
    private Double reduced_price;

    @JsonFormat(pattern = "dd-mm-yyyy")
    @Column(name = "start_date")
    private Date start_date;

    @JsonFormat(pattern = "dd-mm-yyyy")
    @Column(name = "end_date")
    private Date end_date;

    @ManyToOne
    @JoinColumn(name = "id_item")
    private Item item;

    public Long getId_price_reduction() {
        return id_price_reduction;
    }

    public void setId_price_reduction(Long id_price_reduction) {
        this.id_price_reduction = id_price_reduction;
    }

    public Double getReduced_price() {
        return reduced_price;
    }

    public void setReduced_price(Double reduced_price) {
        this.reduced_price = reduced_price;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
