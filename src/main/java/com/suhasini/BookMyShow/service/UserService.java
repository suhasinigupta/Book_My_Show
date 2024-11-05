package com.suhasini.BookMyShow.service;

import com.suhasini.BookMyShow.dto.UserLoginDTO;
import com.suhasini.BookMyShow.dto.UserSignupDTO;
import com.suhasini.BookMyShow.model.User;
import com.suhasini.BookMyShow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository ;

    public User loginUser(UserLoginDTO userLoginDTO) throws Exception {
       User savedUser=userRepository.findUserByEmail(userLoginDTO.getEmail()) ;
       if(savedUser==null) throw new Exception(("user not foung")) ;
       BCryptPasswordEncoder decoder=new BCryptPasswordEncoder() ;
       if(decoder.matches(userLoginDTO.getPassword(), savedUser.getPassword())){
           return savedUser ;
       }
       throw new Exception("Invalid password") ;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public User SignupUser(UserSignupDTO userSignupDTO) throws Exception {
        User user=userRepository.findUserByEmail(userSignupDTO.getEmail()) ;
        if(user != null){
            throw new Exception("User already exist") ;
        }

        User newUser=new User() ;
        newUser.setName(userSignupDTO.getName()) ;
        newUser.setEmail(userSignupDTO.getEmail());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder() ;
        newUser.setPassword(encoder.encode(userSignupDTO.getPassword()));
        return userRepository.save(newUser) ;
    }
}
