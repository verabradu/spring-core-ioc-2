package pixel.academy.spring_core_ioc.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.spring_core_ioc.common.Chef;

@RestController
public class DemoController {

    private Chef myChef;

     // setter injection
     // @Autowired
     //public void setMyChef(Chef theChef) {
     //   myChef = theChef;
     //}

    // constructor injection
    @Autowired
    public DemoController(@Qualifier("turkishChef") Chef theChef) {
        myChef = theChef;
    }

    @GetMapping("/recipe")
    public String getRecipe() {
        return myChef.getDailyRecipe();
    }
}
