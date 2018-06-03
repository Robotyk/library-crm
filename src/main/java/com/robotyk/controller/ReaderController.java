package com.robotyk.controller;

import com.robotyk.entity.Reader;
import com.robotyk.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Robotyk on 2018-06-01.
 */

@Controller
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    private LibraryService libraryService;

    @GetMapping("/list")
    public String getReaders(Model model) {
        List<Reader> readers = libraryService.getReaders();
        model.addAttribute("readers", readers);
        return "readers-list";
    }

    @GetMapping("/update")
    public String updateReader(@RequestParam("reader-id") Integer id, Model model) {
        Reader reader = libraryService.getReader(id);
        model.addAttribute("reader", reader);
        return "new-reader";
    }

    @PostMapping("save-reader")
    public String saveNewReader(@ModelAttribute("reader") Reader reader) {
        libraryService.addReader(reader);
        return "redirect:/reader/list";
    }

    @GetMapping("/new")
    public String getNewReader(Model model) {
        Reader newReader = new Reader();
        model.addAttribute("reader", newReader);
        return "new-reader";
    }
}
