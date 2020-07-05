package guru.springframework.sfgdi.services;

//@Profile("EN")
//@Service("i18NService")
public class I18NEnglishGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public I18NEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
