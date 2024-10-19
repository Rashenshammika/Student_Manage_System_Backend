package edu.icet.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Student")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String first_name;
    private  String last_name;
    private String name;
    private String dob;
    private String address;
    @Lob
    @Column(columnDefinition = "MEDIUMTEXT")
    private String image;
    private String contact;
    private String email;
    private String g_name;
    private String g_relation;
    private String g_occupation;
    private String g_contact;
}
