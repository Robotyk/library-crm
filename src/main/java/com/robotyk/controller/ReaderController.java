package com.robotyk.controller;

import com.robotyk.entity.Reader;
import com.robotyk.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String getList(Model model) {
        List<Reader> readers = libraryService.getReaders();
        model.addAttribute("readers", readers);
        return "readers-list";
    }
}
