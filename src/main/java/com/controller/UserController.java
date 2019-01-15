package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
//  @Autowired
//  private UserRepository userRepository;

  /*@GetMapping("/{id}")
  public User findById(@PathVariable Long id) {
    User findOne = this.userRepository.findOne(id);
    return findOne;
  }*/

    @GetMapping("/{id}")
    public Map findById(@PathVariable Long id) {
        Map map = new HashMap();
        map.put("id", id);
        map.put("name", "provider1");
        return map;
    }

}
