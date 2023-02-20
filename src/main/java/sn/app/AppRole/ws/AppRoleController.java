package sn.app.AppRole.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.app.AppRole.dao.AppRoleRepository;
import sn.app.AppRole.entities.AppRoleEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/roles")
@AllArgsConstructor // permet de creer une instance de l'objet appele
public class AppRoleController {
    private AppRoleRepository appRoleRepository;
    @PostMapping(path = "/save")
    public AppRoleEntity save(AppRoleEntity appUserEntitie){
        return appRoleRepository.save(appUserEntitie);
        //On vient de faire une insertion dans la base
    }
    @GetMapping(path = "/all")
    public List<AppRoleEntity> findAll(){
        return appRoleRepository.findAll();
    }
    @GetMapping(path = "/login")//Get Request
    public AppRoleEntity login(@RequestParam String email, @RequestParam String password){
        return appRoleRepository.findByEmailAndPassword(email,password);
    }
}
