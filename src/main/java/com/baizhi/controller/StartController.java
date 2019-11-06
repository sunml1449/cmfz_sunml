package com.baizhi.controller;

import com.baizhi.entity.Star;
import com.baizhi.service.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("star")
public class StartController {
    @Autowired
    private StartService startService;

    @RequestMapping("selectAll")
    public Map<String, Object> selectAll(Integer page, Integer rows) {
        Map<String, Object> map = startService.selectAll(page, rows);
        return map;
    }

    @RequestMapping("edit")
    public Map<String, Object> edit(String oper, Star star, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        try {
            if ("add".equals(oper)) {
                String id = startService.add(star);
                map.put("message", id);
            }

            map.put("status", true);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("status", false);
            map.put("message", e.getMessage());
        }
        return map;
    }

    @RequestMapping("upload")
    public Map<String, Object> upload(MultipartFile photo, String id, HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        System.out.println(photo == null);
        System.out.println(photo.getOriginalFilename());
        try {
//            文件上传
            photo.transferTo(new File(request.getServletContext().getRealPath("/star/img"), photo.getOriginalFilename()));
//            修改banner对象中cover属性
            Star star = new Star();
            star.setId(id);
            star.setPhoto(photo.getOriginalFilename());
            System.out.println(star);
            startService.edit(star);
            map.put("status", true);
        } catch (IOException e) {
            e.printStackTrace();
            map.put("status", false);
        }
        return map;
    }

    @RequestMapping("getAllStarForSelect")
    public void getAllStarForSelect(HttpServletResponse response) throws IOException {
        List<Star> list = startService.getAllStarForSelect();
        String str = "<select>";
        for (Star star : list) {
            str += "<option value=" + star.getId() + ">" + star.getNickname() + "</option>";
        }
        str += "</select>";
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(str);
        /*
        <select>
            <option value='1'>张三</opiton>
            <option value='2'>李四</opiton>
            <option value='1'>张三</opiton>
        </select>
         */

    }

}
