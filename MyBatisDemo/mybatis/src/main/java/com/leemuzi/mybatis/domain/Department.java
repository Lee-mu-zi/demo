package com.leemuzi.mybatis.domain;


import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName department
 */
@Data
public class Department {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 系主任ID
     */
    private Integer deanId;

    /**
     * 
     */
    private String location;

    /**
     * 
     */
    private Date establishDate;
}