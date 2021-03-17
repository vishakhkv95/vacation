package com.vishakh.vacation.Entity;

import javax.persistence.*;

@Entity(name = "vacationDetail")
public class VacationDetails {

  public VacationDetails(com.vishakh.vacation.DTO.VacationDetails vacationDetails) {
    this.name = vacationDetails.getName();
    this.fromDate = vacationDetails.getFromDate();
    this.toDate = vacationDetails.getToDate();
    this.type = vacationDetails.getType();
  }

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "name")
  private String name;

  @Column(name = "fromDate")
  private String fromDate;

  @Column(name = "toDate")
  private String toDate;

  @Column(name = "type")
  private String type;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
