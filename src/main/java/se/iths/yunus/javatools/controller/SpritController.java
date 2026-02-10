package se.iths.yunus.javatools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import se.iths.yunus.javatools.model.Sprit;
import se.iths.yunus.javatools.service.SpritService;

@Controller
@RequestMapping("/sprits")
public class SpritController {
    private final SpritService spritService;

    public SpritController(SpritService spritService) {
        this.spritService = spritService;
    }

    @GetMapping
    public String getAllSprits(Model model) {
        model.addAttribute("sprits", spritService.getAllSprit());
        return "sprits";
    }

    @GetMapping("/new")
    public String showCreateFormSprit() {
        return "create-sprit";
    }

    @PostMapping
    public String createSprits(@ModelAttribute Sprit sprit) {
        Sprit sprit1 = spritService.createSprit(sprit);
        return "redirect:/sprits";
    }

    @GetMapping("/{id}")
    public String getSprit(@PathVariable Long id, Model model) {
        model.addAttribute("sprit", spritService.getSpritId(id));
        return "sprit";
    }

    @PutMapping("/{id}")
    public String updateSprit(@PathVariable Long id, @ModelAttribute Sprit sprit) {
        Sprit sprit1 = spritService.updateSprit(id, sprit);
        return "rediret:/spirts";
    }

    @GetMapping("/{id}/edit")
    public String showUpdate(@PathVariable Long id, Model model) {
        Sprit sprit = spritService.getSpritId(id);
        model.addAttribute("sprit", sprit);
        return "edit-sprit";
    }

    @DeleteMapping("/{id}")
    public String deleteSprit(@PathVariable Long id) {
        spritService.deleteSprit(id);
        return "rediret:/sprits";
    }
}
