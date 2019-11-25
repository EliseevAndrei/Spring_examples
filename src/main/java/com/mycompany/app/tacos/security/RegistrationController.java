package com.mycompany.app.tacos.security;

import com.mycompany.app.tacos.User;
import com.mycompany.app.tacos.UserRoleEnum;
import com.mycompany.app.tacos.data.repository.RoleRepository;
import com.mycompany.app.tacos.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {

    private UserRepository userRepo;
    private PasswordEncoder passwordEncoder;
    private RoleRepository roleRepository;

    @Autowired
    public RegistrationController(
            UserRepository userRepo, PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
        this.roleRepository = roleRepository;
    }

    @GetMapping
    public String registerForm() {
        return "registration";
    }

    @PostMapping
    public String processRegistration(RegistrationForm form) {
        User user = form.toUser(passwordEncoder);
        System.out.println("Привет");
        user.getRoles().add(roleRepository.findByName(UserRoleEnum.USER));
        userRepo.save(user);
        return "redirect:/login";
    }

}
