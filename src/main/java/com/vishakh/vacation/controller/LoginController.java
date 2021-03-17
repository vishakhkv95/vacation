package com.vishakh.vacation.controller;

import com.vishakh.vacation.service.FileService;
import com.vishakh.vacation.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping(path="login")
public class LoginController {

  @Autowired
  FileService fileService;

  @Autowired
  LoginService loginService;

  @PostMapping(path="/getCaptcha")
  public @ResponseBody
  String getCaptcha(){
    return loginService.getCaptcha();
  }

  @PostMapping("/uploadFile")
  public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
    if (!file.isEmpty()) {
      byte[] bytes = file.getBytes();
      String vacatoinDetails = new String(bytes);
      fileService.processFIle(vacatoinDetails);
    }
    return new ResponseEntity<>("Vacation saved successfully", HttpStatus.OK);
  }


}
