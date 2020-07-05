package guru.springframework.sfgdi.services;

//@Service
public class SetterInjectedService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Service Injected";
    }
}
