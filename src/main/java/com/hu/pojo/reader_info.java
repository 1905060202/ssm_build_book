package com.hu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class reader_info {
    private int reader_id;
    private String name;
    private String sex;
    private Date birth;
    private String address;
    private String number;
}
