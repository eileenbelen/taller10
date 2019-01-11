/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor.ExtractClass;

import conmalolor.*;
import java.time.*;
import java.util.*;




public class EmployeeSmellCode
{   
    private float rmu = (float) 386.0;
    private float salary;
    private float bonusPercentage;    
    private EmployeeType employeeType;    

    public EmployeeSmellCode(float salary, float bonusPercentage, EmployeeType employeeType)    
    {        
        this.salary = salary;        
        this.bonusPercentage = bonusPercentage;        
        this.employeeType = employeeType;    
    }    

    /*
             REFACTORING: Encapsulate Field
    */
    
    
    /**
     * @return the rmu
     */
    public float getRmu() {
        return rmu;
    }

    /**
     * @param rmu the rmu to set
     */
    public void setRmu(float rmu) {
        this.rmu = rmu;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the bonusPercentage
     */
    public float getBonusPercentage() {
        return bonusPercentage;
    }

    /**
     * @param bonusPercentage the bonusPercentage to set
     */
    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    /**
     * @return the employeeType
     */
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    /**
     * @param employeeType the employeeType to set
     */
    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }
    
    
}
