package com.sky.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class EmployeePageQueryDTO implements Serializable {

    @ApiModelProperty("员工姓名")
    //员工姓名
    private String name;

    @ApiModelProperty(value = "页码", required = true)
    //页码
    private int page;

    @ApiModelProperty(value = "每页显示记录数", required = true)
    //每页显示记录数
    private int pageSize;

}
