package com.robotyk.controller;

import com.robotyk.dao.ReaderDao;
import com.robotyk.entity.Reader;
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
    private ReaderDao readerDao;

    @GetMapping("/list")
    public String getList(Model model) {
        List<Reader> readers = readerDao.getReaders();
        model.addAttribute("readers", readers);
        return "readers-list";
    }
}
