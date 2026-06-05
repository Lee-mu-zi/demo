package com.leemuzi.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeacherTitleCountDTO {

    private String title;

    private int totalCount;
}
