package grace.guides;

import org.graceframework.plugins.inertia.InertiaPage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoteController {

    @GetMapping("/note/index")
    public InertiaPage index() {
        return InertiaPage.of("note/index");
    }

    @GetMapping("/note/create")
    public InertiaPage create() {
        return InertiaPage.of("note/create");
    }

    @GetMapping("/note/show")
    public InertiaPage show() {
        return InertiaPage.of("note/show");
    }

    @GetMapping("/note/edit")
    public InertiaPage edit() {
        return InertiaPage.of("note/edit");
    }

}
