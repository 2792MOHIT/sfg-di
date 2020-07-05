package guru.springframework.sfgdi.services;

/**
 * @author MOHIT
 * @created 02-07-2020
 */
public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang){
            case "PR":
                return new PrimaryGreetingService(greetingRepository);
            case "EN":
                return new I18NEnglishGreetingService(greetingRepository);
            case "ES":
                return new i18NSpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
