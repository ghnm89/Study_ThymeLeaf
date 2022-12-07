package com.root.study.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MainTableDTO {
    private String name;
    private String position;
    private String office;
    private Integer age;
    private String startDate;
    private String salary;
}
