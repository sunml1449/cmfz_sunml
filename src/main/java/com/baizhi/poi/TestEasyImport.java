package com.baizhi.poi;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;

import java.io.File;
import java.util.List;

public class TestEasyImport {
    public static void main(String[] args) {
        ImportParams params = new ImportParams();
        params.setTitleRows(1);
        params.setHeadRows(1);


        List<User> list = ExcelImportUtil.importExcel(new File("D:/Desktop/新建文件夹/user.xls"), User.class, params);

        for (User user : list) {
            System.out.println(user);
        }


    }

}
