package pixel.academy.spring_core_ioc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Chef;

@RestController
public class DemoController {

    private final Chef myChef;

    @Autowired
    public DemoController(Chef theChef) {
        myChef = theChef;
    }

    @GetMapping("/recipe")
    public String getRecipe() {
        return myChef.getDailyRecipe();
    }
}
