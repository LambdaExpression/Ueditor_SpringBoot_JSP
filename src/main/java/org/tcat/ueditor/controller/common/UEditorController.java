package org.tcat.ueditor.controller.common;

import com.baidu.ueditor.ActionEnter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Lin on 2016/12/26.
 */
@Controller
@RequestMapping("/ued")
public class UEditorController {

    @RequestMapping(value = "/config")
    public void config(HttpServletRequest request, HttpServletResponse response) {

        response.setContentType("application/json");
        String rootPath = request.getSession()
                .getServletContext().getRealPath("/");
        try {
            request.setCharacterEncoding( "utf-8" );
            response.setHeader("Content-Type" , "text/html");
            response.getWriter().write( new ActionEnter( request, rootPath ).exec() );
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
