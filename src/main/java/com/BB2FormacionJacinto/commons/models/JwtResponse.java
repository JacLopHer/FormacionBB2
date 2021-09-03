package com.BB2FormacionJacinto.commons.models;

import java.io.Serializable;

public class JwtResponse implements Serializable
{
    private static final long serialVersionUID = -2550185165626007488L;
    private final String jwtToken;

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getToken() {
        return this.jwtToken;
    }
}