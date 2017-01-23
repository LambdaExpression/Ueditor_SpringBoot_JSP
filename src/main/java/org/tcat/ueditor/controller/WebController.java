package org.tcat.ueditor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Lin on 2017/1/23.
 */
@RestController
public class WebController {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index").addObject("time", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E").format(new Date()));
    }

    @GetMapping("/ueditor")
    public ModelAndView ueditor() {
        return new ModelAndView("ueditor");
    }

}
