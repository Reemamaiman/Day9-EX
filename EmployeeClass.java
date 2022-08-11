package com.example.employees;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v2/Employee")

public class EmployeeClass {


    ArrayList<Employees> Emmp = new ArrayList<>();

    @PostMapping("/Employee")
    public ResponseEntity addUser(@RequestBody @Valid Employees e, Errors errors) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new emplyeemessage(message, 400));
        }
        Emmp.add(e);
        return ResponseEntity.status(201).body(new emplyeemessage("new user added!", 400));

    }


    @PutMapping("/Employee/{index}")
    public ResponseEntity updateUser(@PathVariable @Valid Employees e, Errors errors) {
        if (errors.hasErrors()) {
            String message = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new emplyeemessage(message, 400));
        }
        Emmp.add(e);
        return ResponseEntity.status(201).body(new emplyeemessage("new user update"));
    }


    @DeleteMapping("/Employee/{index}")
    public ResponseEntity delete(@PathVariable int index Errors error) {
        if (errors.hasError()) {
            if (errors.hasErrors()) {
                String message = errors.getFieldError().getDefaultMessage();
                return ResponseEntity.status(400).body(new emplyeemessage(message, 400));
            }


            Emmp.remove(e);
            return ResponseEntity.status(201).body(new emplyeemessage("new user added!", 400));
        }


    }
}
