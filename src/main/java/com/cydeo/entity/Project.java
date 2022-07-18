package com.cydeo.entity;


import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class Project {

    private String name;
    private String code;
    private User manager;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String detail;

    public Project(String name, String code, User manager, LocalDateTime startDate, LocalDateTime endDate, String detail) {
        this.name = name;
        this.code = code;
        this.manager = manager;
        this.startDate = startDate;
        this.endDate = endDate;
        this.detail = detail;
    }
}
