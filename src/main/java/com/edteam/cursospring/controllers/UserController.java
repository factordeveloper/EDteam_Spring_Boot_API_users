package com.edteam.cursospring.controllers;

import com.edteam.cursospring.models.User;
import com.edteam.cursospring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    ///// TRAE TODOS LOS USUARIOS
    @RequestMapping(value="/", method = RequestMethod.GET)
    List<User> getAll(){
        return userService.getAll();
    }

    ///// TRAE UN USUARIO SEGUN SU ID
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    User get(@PathVariable long id){

        return userService.get(id);
    }

    ///// REGISTRAR USUARIO
    @RequestMapping(value="/", method = RequestMethod.POST)
    User register(@RequestBody User user){

       /// TODO: registrarlo en la BD
         return userService.register(user);
    }

    ///// Actualizar USUARIO
    @RequestMapping(value="/{id}", method = RequestMethod.PUT)
    User update(@RequestBody User user){

        /// TODO: actualizarlo en la BD
        return userService.update(user);
    }

    ///// BORRAR UN USUARIO SEGUN SU ID
    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    void delete(@PathVariable long id){
        // TODO: Eliminarlo de la BD
        userService.delete(id);
    }


}



