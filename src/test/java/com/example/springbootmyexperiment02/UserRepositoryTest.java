package com.example.springbootmyexperiment02;

import com.example.springbootmyexperiment02.entity.Address;
import com.example.springbootmyexperiment02.entity.User;
import com.example.springbootmyexperiment02.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserRepositoryTest {
   @Autowired
    private UserRepository userRepository;
   @Test
    public void addUserTest(){
       User u1 = new User("xuan");
       User u2 = new User("li");
       userRepository.addUser(u1);
       userRepository.addUser(u2);
   }
   @Test
    public void addAddressTest(){
       Address a1 = new Address("433");
       Address a2 = new Address("434");
       Address a3 = new Address("435");
       userRepository.addAddress(a1,1);
       userRepository.addAddress(a2,1);
       userRepository.addAddress(a3,2);
   }
   @Test
    public void updateUserTest(){
       userRepository.updateUser(1,"gao");
   }
   @Test
    public void updateAddressTest(){
       userRepository.updateAddress(3, 1);
   }
   @Test
    public void listAddressesTest(){
       List<Address> addresses = userRepository.listAddresses(1);
       log.debug(""+addresses.size());
       addresses.forEach(a->{
           log.debug(a.getAddress());
       });
   }
   @Test
    public void removeAddressTest(){
       userRepository.removeAddress(3);
   }
   @Test
    public void removeUserTest(){
       userRepository.removeUser(2);
   }
}
