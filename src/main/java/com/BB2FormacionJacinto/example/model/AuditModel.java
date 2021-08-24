package com.BB2FormacionJacinto.example.model;

import java.sql.Timestamp;


public class AuditModel {

    private Timestamp createdDate;
    private Timestamp modifiedDate;

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}
