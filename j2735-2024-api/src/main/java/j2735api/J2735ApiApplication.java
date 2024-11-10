package j2735api;

import j2735ffm.MessageFrameCodec;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class J2735ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(j2735api.J2735ApiApplication.class, args);
    }

    @Bean
    public MessageFrameCodec messageFrameCodec() {
        return new MessageFrameCodec();
    }
}
