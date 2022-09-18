package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue

    private long custId;

    private String custName;

    private String custAddress;

    private long custContactNumber;

    private double custAccountBalance;

    @JsonFormat(pattern = "dd-MM-YYYY" ,timezone = "Asia/Kolkata")
    private Date custDOB;
}


