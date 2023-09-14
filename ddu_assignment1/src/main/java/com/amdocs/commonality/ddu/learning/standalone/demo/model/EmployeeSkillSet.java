package com.amdocs.commonality.ddu.learning.standalone.demo.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeSkillSet {
    private String empId;
    private List<String> requiredSkills = new ArrayList<>();
    private List<String> actualSkills = new ArrayList<>();

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public List<String> getActualSkills() {
        return actualSkills;
    }

    public void setActualSkills(List<String> actualSkills) {
        this.actualSkills = actualSkills;
    }
}
 