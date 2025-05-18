package com.ThymleafLearn.Thymleaf_Project.Controller;

import com.ThymleafLearn.Thymleaf_Project.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class Employee_controller {

    @GetMapping("/getForm")
    public ModelAndView getRegistrationForm(){
        String viewName = "register";
        Map<String, Object> model = new HashMap<>();
        //model.put("displaykaroname","Ranjeet");

        Employee e = new Employee();
        e.setfName("john"); //placeholder
        e.setlName("doe"); // placeholder
        model.put("employeeEntry",e);

        return new ModelAndView(viewName,model);
    }
}
