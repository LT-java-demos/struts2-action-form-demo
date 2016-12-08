package com.lt.action;

import com.lt.model.User;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

public class regAction implements ModelDriven<User>, ServletRequestAware {
    private User user = new User();
    private HttpServletRequest request;


    public User getModel() {
        return user;
    }

    public String execute() {
        if ("Leonard".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            request.setAttribute("username", user.getUsername());
            return "success";
        } else {
            return "error";
        }
    }


    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.request = httpServletRequest;
    }
}
