package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import com.example.demo.request.SearchRequest;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeDao;

@Controller
    public class EmployeeController {
        @Autowired
        EmployeeDao repo;
    
        @GetMapping("")
        public String getAll(Model model) {
            model.addAttribute("employees", repo.getAll());
            model.addAttribute("request", new SearchRequest());
            return "home";
        }
        // tìm theo id
    @GetMapping("/employee/{id}")
    public String getById(Model model, @PathVariable int id) {
        if (repo.get(id).isPresent()) {
            model.addAttribute("employee", repo.get(id).get());
            return "employee";
        } else {
            return "notExist";
        }
    }

    // thêm mới employee
    @GetMapping("/add")
    public String addEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("title", "Add new Employee");
        return "form";
    }

    // lưu ý khai báo theo đúng thứ tự: BindingResult phải khai báo sau employee
    @PostMapping("/save")
    public String saveFormSubmit(Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        if (employee.getId() > 0) {
            repo.update(employee);
        } else {
            repo.add(employee);
        }

        return "redirect:/";
    }

    // update employee theo id
    @GetMapping("/update/{id}")
    public String updateById(Model model, @PathVariable int id) {
        if (repo.get(id).isPresent()) {
            model.addAttribute("employee", repo.get(id).get());
            model.addAttribute("title", "Update Employee");
        }
        return "form";
    }

    // xóa theo id
    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable int id, Model model) {
        if (repo.get(id).isPresent()) {
            repo.deleteById(id);
            model.addAttribute("employees", repo.getAll());
        }
        return "redirect:/";
    }

    // tìm theo keyword
    // By default the model attribute name is taken as Bean class's name with first
    // lowercase letter, phải thêm @ModelAttribute("request")
    // để nó hiểu request là 1 attribute, còn k thì cần đặt tên giống tên class:
    // searchRequest (chữ đầu k viết hoa)
    @PostMapping("/search")
    public String searchByKeyWord(@ModelAttribute("request") SearchRequest request, BindingResult result, Model model) {
        if (!result.hasFieldErrors()) {
            model.addAttribute("employees", repo.searchByKeyWord(request.getKeyword()));
        }
        return "home";
    }
    }
    

