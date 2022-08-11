package com.example.employees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor @Data
public class Employees {
    @NotEmpty(message = "Cannot be null")
    @Size(min =2,max =10,message = "Length more than 2")
    private int ID;

    @NotEmpty(message = "Cannot be null")
    @Max(value = 25,message = "it must be more than 25")
    private int age;

    @NotEmpty(message = "cannot be null")
    @Size(min = 4,max =7,message = "Length more than 4")
    private String name;


    private boolean onLeave=false;

    @NotNull(message= " employmentYear  can't be Empty !")
    @Range(min = 1900, max = 2022)
    private int employmentYear;
    @NotNull(message= " annualLeave  can't be Empty !")
    @Range(max=30, message = " annualLeave have to be number  ! ")
    private int annualLeave;

}






