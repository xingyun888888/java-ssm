package com.gaochao.web.session;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * Created by smileMAC on 18/4/25.
 */
@Component
public class HttpSessionProvider implements SessionProvider {

  public void setAttribute(HttpServletRequest request, String name, Serializable value){
      HttpSession session = request.getSession();
      session.setAttribute(name,value);
  }

  public Serializable getAttrbute(HttpServletRequest request,String name){
      HttpSession session = request.getSession(false);
      if(session != null){
          return (Serializable) session.getAttribute(name);
      }
      return null;
  }

  public void logout(HttpServletRequest request) {
      HttpSession session = request.getSession(false);
      if(session != null){
          session.invalidate();
      }
  }
}

