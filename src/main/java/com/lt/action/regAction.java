package com.lt.action;

import com.lt.model.User;
import com.opensymphony.xwork2.ModelDriven;

public class regAction implements ModelDriven<User> {
    private User user = new User();

    public User getModel() {
        return user;
    }

    public String execute() {
        if ("Leonard".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            return "success";
        } else {
            return "error";
        }
    }

}
