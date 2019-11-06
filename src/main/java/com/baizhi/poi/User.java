package com.baizhi.poi;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Excel(name = "编号")
    private String id;
    @Excel(name = "姓名")
    private String name;
    @Excel(name = "生日", format = "yyyy-MM-dd")
    private Date bir;
//    @Excel(name = "头像",type = 2)
//    private String photo;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBir() {
        return bir;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }
}
