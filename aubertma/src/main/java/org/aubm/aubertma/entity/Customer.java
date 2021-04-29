package org.aubm.aubertma.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity(name = "Customer")
public class Customer {
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String codeINSEE;

    @Column
    private String city;

    public Customer(int id, String name, String code) {
        this.id = id;
        this.name = name;
        codeINSEE = code;
    }

}
