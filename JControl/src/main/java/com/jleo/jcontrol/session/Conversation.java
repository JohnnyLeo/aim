package com.jleo.jcontrol.session;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jleo
 * @date 2021/1/19
 * @description used to control the session
 */
@Component
public interface Conversation {

    /**
     * determine whether the user is logged in
     * @param request
     * @return
     */
    boolean isLogin(HttpServletRequest request);

    /**
     * do login
     * @param request
     * @param response
     * @return
     */
    boolean signIn(HttpServletRequest request, HttpServletResponse response);

    /**
     * do logout
     * @param request
     * @param response
     * @return
     */
    boolean signOut(HttpServletRequest request, HttpServletResponse response);
}
