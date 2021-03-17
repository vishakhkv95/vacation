package com.vishakh.vacation.service.impl;

import com.vishakh.vacation.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LoginServiceImpl implements LoginService {

  @Override
  public String getCaptcha() {
    Random rand = new Random();
    int numOne = rand.nextInt(100);
    int numTwo = rand.nextInt(100);
    return numOne+"+"+numTwo;
  }
}
