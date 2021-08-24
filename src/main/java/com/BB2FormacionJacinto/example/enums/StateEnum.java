package com.BB2FormacionJacinto.example.enums;

public enum StateEnum {
    ACTIVE(1,"Active"),
    DISCONTINUED(0,"Discontinued");

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

    public Integer getId(){
        return id;
    }

}
