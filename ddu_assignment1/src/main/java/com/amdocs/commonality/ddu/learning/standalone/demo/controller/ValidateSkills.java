package com.amdocs.commonality.ddu.learning.standalone.demo.controller;

import com.amdocs.commonality.ddu.learning.standalone.demo.model.EmployeeMissingSkillSet;

import com.amdocs.commonality.ddu.learning.standalone.demo.model.EmployeeSkillSet;
import com.amdocs.commonality.ddu.learning.standalone.demo.service.ValidationSkillApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidateSkills {
    @Autowired
    ValidationSkillApplicationService validationSkillApplicationService;

    @PostMapping("employeemanagement/v1/validateEmployeeSkills")
    public ResponseEntity<EmployeeMissingSkillSet> validateSkills(@RequestBody EmployeeSkillSet employeeSkillset) {
        return new ResponseEntity<>(validationSkillApplicationService.validateSkills(employeeSkillset), HttpStatus.CREATED);
    }
}
