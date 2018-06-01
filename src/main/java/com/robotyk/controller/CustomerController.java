package com.robotyk.controller;

import com.robotyk.dao.CustomerDao;
import com.robotyk.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Robotyk on 2018-06-01.
 */
@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/list")
    public String getList(Model model) {
        List<Customer> customers = customerDao.getCustomers();
        model.addAttribute("customers", customers);
        return "customers-list";
    }
}
