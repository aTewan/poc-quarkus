package org.antoinep.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
  private String firstName;
  private String lastName;
  private int age;

  public User(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
}
