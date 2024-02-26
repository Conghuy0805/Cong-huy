package com.example.xem_gio_hien_tai_cua_city.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/work-clock")
    public String getTimeByTimeZone(ModelMap model, @RequestParam(value = "name = city", required = false, defaultValue = "Asia/Ho_Chi_Minh") String city) {
        // Lay ra thoi gian hien tai
        Date date = new Date();
        // Lay ra time zone hien tai
        TimeZone local = TimeZone.getDefault();
        // Lay ra time zone cua 1 thanh pho cu the
        TimeZone locale = TimeZone.getTimeZone(city);

        // Tinh thoi gian hien tai cua 1 thanh pho cu the
        long locale_time = date.getTime() + (local.getRawOffset() - local.getRawOffset());
        // Cai dat lai thoi gian cho bien date thanh thoi gian hien tai cho 1 thanh pho cu the
        date.setTime(locale_time);

        model.addAttribute("city", city);
        model.addAttribute("date", date);
        return "index";
    }
}
