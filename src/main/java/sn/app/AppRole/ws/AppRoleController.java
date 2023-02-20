package sn.app.AppRole.ws;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.app.AppRole.dao.AppRoleRepository;
import sn.app.AppRole.entities.AppRoleEntity;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
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
}
