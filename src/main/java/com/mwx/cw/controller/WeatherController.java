package com.mwx.cw.controller;

import com.mwx.cw.entity.Weather;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @RequestMapping("/getWeather")
    public Weather getWeather(@RequestParam(value = "w_id")String w_id){
        List<String> info = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            info.add(i+"");
        }
        System.out.println(w_id);
        return new Weather("200",info);
    }



}
