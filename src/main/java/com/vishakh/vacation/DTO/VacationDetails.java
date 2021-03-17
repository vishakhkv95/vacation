package com.vishakh.vacation.DTO;

public class VacationDetails {
  private String name;
  private String fromDate;
  private String toDate;
  private String type;

  public VacationDetails(String name, String fromDate, String toDate, String type) {
    this.name = name;
    this.fromDate = fromDate;
    this.toDate = toDate;
    this.type = type;
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
