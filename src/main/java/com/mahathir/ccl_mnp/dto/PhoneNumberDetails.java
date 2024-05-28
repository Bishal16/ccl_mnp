package com.mahathir.ccl_mnp.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

@Entity
@Table(name = "tb_mnp")
@Data
public class PhoneNumberDetails {
    @Id
    private String number;

    private Date portedDate;
    private int recipientRC;
    private int donorRC;
    private int nrhRC;
    private String numberType;
    private String portedAction;

}
