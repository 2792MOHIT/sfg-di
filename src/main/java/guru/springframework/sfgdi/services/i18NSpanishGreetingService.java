package guru.springframework.sfgdi.services;

//@Profile({"ES","default"})
//@Service("i18NService")
public class i18NSpanishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public i18NSpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hola Mundo- ES";
    }
}
