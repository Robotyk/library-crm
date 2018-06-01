package com.robotyk.dao;

import com.robotyk.entity.Customer;
import java.util.List;

/**
 * Created by Robotyk on 2018-06-01.
 */

public interface CustomerDao {

    List<Customer> getCustomers();
}
