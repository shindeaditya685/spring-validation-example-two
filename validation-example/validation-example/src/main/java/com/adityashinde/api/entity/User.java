package com.adityashinde.api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USERS_TBL", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
public class User {

    @Id
    @GeneratedValue
    private Integer userId;

    private String name;

    private String email;

    private String mobile;

    private String gender;

    private Integer age;

    private String nationality;
}
