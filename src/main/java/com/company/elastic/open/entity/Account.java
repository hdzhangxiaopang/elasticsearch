package com.company.elastic.open.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Document(indexName = "bank", type = "_doc")
public class Account {

    @Id
    private Long id;

    @JsonProperty("account_number")
    private long accountNumber;

    private long balance;

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("lastname")
    private String lastName;

    private int age;

    private String gender;

    private String address;

    private String employer;

    private String email;

    private String city;

    private String state;
}
