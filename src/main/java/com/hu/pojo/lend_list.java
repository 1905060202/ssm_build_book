package com.hu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class lend_list {
    private int ser_num;
    private int book_id;
    private int reader_id;
    private Date lend_date;
    private Date back_date;

}
