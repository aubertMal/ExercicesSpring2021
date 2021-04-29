package org.aubm.aubertma.entity;

import lombok.Data;

@Data
public class Customer {
    private int id;
    private String name;
    private String codeINSEE;
    private String city;

    public Customer(int id, String name, String code) {
        this.id = id;
        this.name = name;
        codeINSEE = code;
    }

}
