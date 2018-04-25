package com.gaochao.web.session;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * Created by smileMAC on 18/4/25.
 */
public interface SessionProvider {

    public void setAttribute(HttpServletRequest request, String name, Serializable value);

    public Serializable getAttrbute(HttpServletRequest request, String name);

    public void logout(HttpServletRequest request);

}