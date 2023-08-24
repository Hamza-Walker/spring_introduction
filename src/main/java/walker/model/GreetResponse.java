package walker.model;

import java.util.List;

public record GreetResponse(
        String greet,
        List<String> favProgLan,
        Person person
) {}
