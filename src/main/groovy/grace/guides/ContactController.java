package grace.guides;

import org.graceframework.plugins.inertia.Inertia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

    @GetMapping("/contact/index")
    public ModelAndView index() {
        return Inertia.render("contact/index");
    }

    @GetMapping("/contact/create")
    public ModelAndView create() {
        return Inertia.render("contact/create");
    }

    @GetMapping("/contact/show")
    public ModelAndView show() {
        return Inertia.render("contact/show");
    }

    @GetMapping("/contact/edit")
    public ModelAndView edit() {
        return Inertia.render("contact/edit");
    }

}
