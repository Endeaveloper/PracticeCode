package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
        System.out.println("@TEST@");

        for (int i=2; i<10; i++){

            for (int j=1; j<10; j++){
                System.out.println( i + " X " + j + " = " +(i*j));

            }
            System.out.println("=========================");
        }
    }
}
