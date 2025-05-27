package pixel.academy.spring_core_ioc.common;


import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Kebab";
    }
}
