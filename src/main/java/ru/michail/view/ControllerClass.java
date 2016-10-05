package ru.michail.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.michail.service.ServiceClass;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Admin on 10/5/16.
 */
@Controller
public class ControllerClass {
    @Autowired
    ServiceClass serviceClass;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView getTable(Model model) {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("listatt", serviceClass.getAll());
        return modelAndView;
    }
}
