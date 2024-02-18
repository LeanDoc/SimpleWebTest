package Main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DefaultController {
@RequestMapping("/")
    String index(){
        return (new Date().toString()) + "\n Hello world";
    }

}
