package auros.test.controller;

import auros.test.service.KPacSetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/set")
@RequiredArgsConstructor
public class SetController {
    private final KPacSetService kpacSetService;

    @GetMapping("/{id}")
    public String getKPacSet(@PathVariable Long id, Model model) {
        model.addAttribute("kPacSet", kpacSetService.getById(id));
        return "set";
    }
}
