package com.cybertek.dto;


import com.cybertek.enums.Gender;

public class UserDTO {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;

    public UserDTO() {
    }



    public UserDTO(String firstName, String lastName, String userName, String password, boolean enabled, String phone, RoleDTO role, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.phone = phone;
        this.role = role;
        this.gender = gender;
    }


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }
}
