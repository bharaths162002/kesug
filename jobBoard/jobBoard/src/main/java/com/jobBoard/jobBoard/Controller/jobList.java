package com.jobBoard.jobBoard.Controller;

import com.jobBoard.jobBoard.Entity.JobRegistration;
import com.jobBoard.jobBoard.Service.JobBoardService;
import com.jobBoard.jobBoard.Service.JobRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jobList {

    @Autowired
    private JobRegistrationService jobRegistrationService;

    @PostMapping(value = "addRegister")
    public String addRegistrationDetails(@RequestBody JobRegistration jobRegistration){
        jobRegistrationService.saveRegistrationDetails(jobRegistration);
        return "jobApp";
    }

}
