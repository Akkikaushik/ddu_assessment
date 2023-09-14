package com.amdocs.commonality.ddu.learning.standalone.demo.service;

import com.amdocs.commonality.ddu.learning.standalone.demo.model.EmployeeMissingSkillSet;
import com.amdocs.commonality.ddu.learning.standalone.demo.model.EmployeeSkillSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationSkillApplicationService {
    @Autowired
    EmployeeMissingSkillSet employeeMissingSkillset;

    public EmployeeMissingSkillSet validateSkills(EmployeeSkillSet employeeSkillset) {
        employeeMissingSkillset.setEmpId(employeeSkillset.getEmpId());
        employeeSkillset.getRequiredSkills().removeIf(
                requiredSkill->employeeSkillset.getActualSkills().stream().anyMatch(
                        actualSkill->actualSkill.equalsIgnoreCase(requiredSkill)
                )
        );
        employeeMissingSkillset.setMissingSkills(employeeSkillset.getRequiredSkills());
        return employeeMissingSkillset;
    }
}
 

 