package com.suhasini.BookMyShow.controller;

import com.suhasini.BookMyShow.dto.UserLoginDTO;
import com.suhasini.BookMyShow.dto.UserSignupDTO;
import com.suhasini.BookMyShow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService ;

    @PostMapping("/signUp")
    public ResponseEntity signup(@RequestBody UserSignupDTO userSignupDTO) throws Exception {
        if(userSignupDTO.getEmail()==null || userSignupDTO.getName()==null || userSignupDTO.getEmail().length()==0 || userSignupDTO.getName().length()==0 )
            throw new Exception("Enter valid credentials") ;
        return ResponseEntity.ok(userService.SignupUser(userSignupDTO)) ;
    }

    @PostMapping("login")
    public ResponseEntity login(@RequestBody UserLoginDTO userLoginDTO) throws Exception {
        return ResponseEntity.ok(userService.loginUser(userLoginDTO)) ;
    }

}
