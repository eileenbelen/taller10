/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conmalolor.ExtractClass;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class CalculatorSalary {

    private EmployeeSmellCode empleado;
    private int factor = 12 * 2;


    public float cs() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();

        /*
        REFACTORING: Consolidate Conditional Expression
        
         */
        if (this.empleado.getEmployeeType().equals("Worker")) {
            return month % 2 == 0 ? this.empleado.getSalary() : this.empleado.getSalary() + this.empleado.getRmu() / factor;
        } else {
            float value = this.empleado.getSalary() + (this.empleado.getBonusPercentage() * 0.7F);
            return month % 2 == 0 ? value : value + this.empleado.getRmu() / factor;
        }
    }

    
    public float CalculateYearBonus() {
        
        if (this.empleado.getEmployeeType().equals("Worker")) {
            return 0;
        } else {
            return this.empleado.getSalary() + this.empleado.getSalary() * 0.7F;
        }
    }
}
