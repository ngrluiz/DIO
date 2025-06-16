package DIO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
// import your application's User entity instead of Spring Security's User
// Update the import path to match the actual package of your User class
import DIO.model.User;
import org.springframework.stereotype.Component;
// Update the import path to match the actual package of your UserRepository interface
import DIO.repository.UserRepository;
import repository.UserRepository;


@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        User user = new User();
        user.setName("Luiz");
        user.setUsername("Lu");
        user.setPassword("Lu123");

        repository.save(user);


        for(User u: repository.findAll()){
            System.out.println(u);

        }
        
    }



}
