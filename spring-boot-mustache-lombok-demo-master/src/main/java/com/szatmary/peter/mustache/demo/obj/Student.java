package com.szatmary.peter.mustache.demo.obj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by nue on 24.6.2016.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    private String name;

    private Integer age;

    private Address address;
}