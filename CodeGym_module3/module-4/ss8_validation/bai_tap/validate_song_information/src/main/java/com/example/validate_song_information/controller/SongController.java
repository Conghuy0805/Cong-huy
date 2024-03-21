package com.example.validate_song_information.controller;

import com.example.validate_song_information.model.Song;
import com.example.validate_song_information.service.ISongService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {
    @Autowired
    private ISongService iSongService;

    @GetMapping("")
    public String showListSong(Model model) {
        List<Song> list = iSongService.findAll();
        model.addAttribute("list", list);
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("songCreate", new Song());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("songCreate") Song song, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("songCreate", song);
            return "create";
        }
        iSongService.add(song);
        redirectAttributes.addFlashAttribute("mess", "1");
        return "redirect:/song";
    }

    @GetMapping("/{id}/update")
    public String showUpdate(@PathVariable(name = "id") Integer id, Model model) {
        Song song = iSongService.findById(id);
        model.addAttribute("songUpdate", song);
        return "update";
    }

    @PostMapping("/update")
    public String update(@Validated @ModelAttribute(name = "songUpdate") Song song, @RequestParam(name = "songId") Integer id, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("songUpdate", song);
            return "update";
        }
        iSongService.update(id, song);
        redirectAttributes.addFlashAttribute("mess", "1");
        return "redirect:/song";
    }

    @GetMapping("/{id}/delete")
    private String delete(@PathVariable(name = "id") Integer id, RedirectAttributes redirectAttributes) {
        iSongService.delete(id);
        redirectAttributes.addFlashAttribute("mess", "1");
        return "redirect:/song";
    }
}
