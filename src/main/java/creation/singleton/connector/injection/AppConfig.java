package creation.singleton.connector.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Connector connector(){
        //return new Connector();
        //Si uso el constructor vacio tengo que darle estado a los atributos 
        //de la clase con la Anotation @Value("valor")
        //si uso la Anotattion values solo le puedo dar un solo estado
        //si uso el constructor puedo generar muchos métodos con distintos estados
        return new Connector("com.mysql.cj.jdbc.Driver","jdbc:mysql://localhost/test","root","");
    }
}
