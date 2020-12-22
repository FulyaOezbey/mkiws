package info.vs_verleihservice.mkiws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MkiwsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MkiwsApplication.class, args);
    }

    @RestController
    class Verleiservice {

        @RequestMapping(path="/")
        public String  hallo() {
            return "kjhgkjhjhgf";
        }

    }



}
