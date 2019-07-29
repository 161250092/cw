package com.mwx.cw.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter
public class Weather {

    public String status;
    public List<String> info;

    public Weather(String status, List<String> info) {
        this.status = status;
        this.info = info;
    }

}
