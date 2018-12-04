package greeting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="param", defaultValue="Hello, world!") String name) {
        System.out.println("request-test");
        return new Greeting(name);
    }
}