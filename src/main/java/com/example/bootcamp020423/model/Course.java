package com.example.bootcamp020423.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private Long id;
    private String name;
    private String description;
    private String instructor;
    private float rate;
    private String keyword;

    public Course(String csvData){
        String[] fields = csvData.split(",");
        this.id = Long.parseLong(fields[0]);
        this.name = fields[1];
        this.description = fields[2];
        this.instructor = fields[3];
        this.rate = Float.parseFloat(fields[4]);
        this.keyword = fields[5];
    }


}
