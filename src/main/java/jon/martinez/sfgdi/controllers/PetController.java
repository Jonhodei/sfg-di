package jon.martinez.sfgdi.controllers;


import jon.martinez.sfgdi.services.GreetingService;
import jon.martinez.sfgdi.services.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest(){ return petService.getPetType(); }
}
