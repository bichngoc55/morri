package com.jewlery.morri.model;

import java.util.Date;
// import org.springframework.data.annotation.Id;

public record User(
 
    String employeeId,

    String fullName,

    Date dateOfBirth,

    String identityCard,

    String phoneNumber,

    String email,

    String address,

    String position,

    Date startDate,

    double basicSalary,

    String password,

    String payroll
) {}
