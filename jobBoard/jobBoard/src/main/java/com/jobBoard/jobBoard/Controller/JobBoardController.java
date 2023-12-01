package com.jobBoard.jobBoard.Controller;

import com.jobBoard.jobBoard.Entity.JobBoardCompany;
import com.jobBoard.jobBoard.Service.JobBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@CrossOrigin(origins="http://127.0.0.1:5500",methods = RequestMethod.GET)
public class JobBoardController {
    @Autowired
    private JobBoardService jobBoardService;


    @RequestMapping(value="/jobApp")
    public String JobApp() {
        return "jobApp";
    }

    @RequestMapping(value = "companies")
    public String CompaniesApp(){
        return "companies";
    }
    @RequestMapping(value = "jobs")
    public String JobListApp(){
        return "jobs";
    }
    @RequestMapping(value = "registration")
    public String registerForm() {
        return "register";
    }

    @RequestMapping(value = "login")
    public String loginForm() {
        return "login";
    }
    @GetMapping("/getCompany")
    public List<JobBoardCompany> findCompany(){
        return jobBoardService.findAllJobs();
    }


}
