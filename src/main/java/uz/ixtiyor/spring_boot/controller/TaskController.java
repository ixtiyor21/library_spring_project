package uz.ixtiyor.spring_boot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import uz.ixtiyor.spring_boot.dto.task.TaskCreateDto;
import uz.ixtiyor.spring_boot.services.task.TaskService;

@Controller
@RequestMapping(value = "/task/*")
public class TaskController extends AbstractController<TaskService>{

    @Autowired
    public TaskController(TaskService service) {
        super(service);
    }


    @RequestMapping(value = "create/", method = RequestMethod.GET)
    public String createPage() {
        return "task/create";
    }


    @RequestMapping(value = "create/", method = RequestMethod.POST)
    public String create(@ModelAttribute TaskCreateDto dto) {
        service.create(dto);
        return "redirect:/";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String deletePage(Model model, @PathVariable(name = "id") Long id) {
        model.addAttribute("column", service.get(id));
        return "column/delete";
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return "redirect:/";
    }

}
