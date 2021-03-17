package com.vishakh.vacation.service.impl;

import com.vishakh.vacation.DTO.VacationDetails;
import com.vishakh.vacation.Repository.VacationRepository;
import com.vishakh.vacation.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FIleServiceImpl implements FileService {

  @Autowired
  VacationRepository vacationRepository;

  @Override
  public void processFIle(String VacationDetails) {
    VacationDetails = VacationDetails.replaceAll("( )+", " ");
    VacationDetails = VacationDetails.replaceAll("\r", "");
    String[] rows = VacationDetails.split("\n");
    List<String> data = new ArrayList<>();
    Collections.addAll(data, rows);
    String rowData[];
    String dates[];
    List<com.vishakh.vacation.DTO.VacationDetails> vacationDetails = new ArrayList<>();
    for (String row : data) {
      rowData = row.split(" ");
      dates = rowData[1].split("-");
      VacationDetails vacationDetail = new VacationDetails(rowData[0], dates[0], dates[1], rowData[2]);
      com.vishakh.vacation.Entity.VacationDetails vacData = new com.vishakh.vacation.Entity.VacationDetails(vacationDetail);
      vacationRepository.save(vacData);
    }
  }
}

