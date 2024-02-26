package com.example.ung_dung_tu_dien.controller;

import com.example.ung_dung_tu_dien.model.Dictionary;
import com.example.ung_dung_tu_dien.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;

    @GetMapping("/search")
    public String search() {
        return "search";
    }

    @PostMapping("/result")
    public String result(@RequestParam String keyword, Model model) {
        List<Dictionary> list = iDictionaryService.findAll();
        for (int i = 0; i < list.size(); i++) {
            if (keyword.equalsIgnoreCase(list.get(i).getEnglish())) {
                model.addAttribute("word", list.get(i).getVietnamese());
                model.addAttribute("keyword", keyword);
                return "mean";
            }
        }
        return "mean";
    }
}
