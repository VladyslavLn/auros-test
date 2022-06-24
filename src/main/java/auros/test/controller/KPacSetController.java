package auros.test.controller;

import auros.test.convertor.KPacEditor;
import auros.test.model.KPac;
import auros.test.model.KPacSet;
import auros.test.service.KPacService;
import auros.test.service.KPacSetService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sets")
@RequiredArgsConstructor
public class KPacSetController {

    private final KPacService kpacService;
    private final KPacSetService kpacSetService;

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute("kPacSet", new KPacSet());
        return "sets";
    }

    @PostMapping()
    public String save(@ModelAttribute("kPacSet") KPacSet kpacSet) {
        kpacSetService.save(kpacSet);
        return "redirect:/sets";
    }

    @GetMapping("/{id}")
    public String delete(@PathVariable Long id) {
        kpacSetService.delete(id);
        return "redirect:/sets";
    }

    @ModelAttribute("kPacData")
    public List<KPac> kpacData() {
        return kpacService.getAll();
    }

    @ModelAttribute("kPacSetData")
    public List<KPacSet> kpacSetsData() {
        return kpacSetService.getAll();
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(KPac.class, new KPacEditor(kpacService.getAll()));
    }
}
