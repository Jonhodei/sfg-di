package jon.martinez.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGettingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world - From the PRIMARY Bean";
    }
}
