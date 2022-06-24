package auros.test.controller;

import auros.test.model.KPac;
import auros.test.service.KPacService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kpacs")
@RequiredArgsConstructor
public class KPacController {

    private final KPacService kpacService;

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute("kPac", new KPac());
        return "kpacs";
    }

    @PostMapping
    public String save(@ModelAttribute("kPac") KPac kpac) {
        kpacService.save(kpac);
        return "redirect:/kpacs";
    }

    @GetMapping ("/{id}")
    public String delete(@PathVariable Long id) {
        kpacService.delete(id);
        return "redirect: /kpacs";
    }

    @ModelAttribute("kPacData")
    public List<KPac> getKPacData() {
        return kpacService.getAll();
    }
}
