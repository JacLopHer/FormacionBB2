package com.BB2FormacionJacinto.example.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum StateEnum {
    DISCONTINUED(1,"Discontinued"),
    ACTIVE(2,"Active"),;

    private final Integer id;
    private String description;

    StateEnum(int id, String description) {
            this.id = id;
            this.description = description;
    }

    public static StateEnum getFromId(Integer id){
        for(StateEnum e : values()){
            if(e.id.equals(id)){
                return e;
            }
        }
        return null;
    }

    public static StateEnum getFromDescription(String definition ){
        for(StateEnum e : values()){
            if(e.description.equals(definition)){
                return e;
            }
        }
        return null;
    }

    public Integer getId(){
        return id;
    }

}
