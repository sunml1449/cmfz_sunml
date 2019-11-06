package com.baizhi.service;

import com.baizhi.entity.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface AdminService {
    void login(Admin admin, String inputCode, HttpServletRequest request);

    public void quit(HttpSession session);
}
