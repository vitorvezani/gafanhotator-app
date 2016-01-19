package br.com.gafanhotator.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by vitor on 14/01/2016.
 */
public class User {
    /**
     * The persistent class for the GA_USER database table.
     *
     */
    /**
     * Generated
     */
    private static final long serialVersionUID = 5606433073666923082L;

    private String passwordConfirmation;
    private String emailConfirmation;

    public User() {
    }

    private Long id;
    private Gender gender = Gender.NA;
    private String email;
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String username;
    private boolean enabled;
    private List<UserRole> userRoles;
    private String imgUrl;
    private Date creationDate;

    public String getImgUrl() {
        return imgUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<UserRole> getUserRoles() {
        if (userRoles == null) {
            userRoles = new ArrayList<UserRole>();
        }
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRole) {
        userRoles = userRole;
    }

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String rawPasswordConfirmation) {
        this.passwordConfirmation = rawPasswordConfirmation;
    }

    public String getEmailConfirmation() {
        return emailConfirmation;
    }

    public void setEmailConfirmation(String emailConfirmation) {
        this.emailConfirmation = emailConfirmation;
    }

    public UserRole addUserRole(UserRole userRole) {
        getUserRoles().add(userRole);
        userRole.setUser(this);

        return userRole;
    }

    public UserRole removeUserRole(UserRole userRole) {
        getUserRoles().remove(userRole);
        userRole.setUser(null);

        return userRole;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

	/*
     * Presentations Methods
	 */

    public String getFullName() {
        String firstName = this.firstName != null ? this.firstName : "";
        String lastName = this.lastName != null ? this.lastName : "";

        return firstName + " " + lastName;
    }

    public void update(User updatedUser) {
        this.birthdate = updatedUser.birthdate;
        this.firstName = updatedUser.firstName;
        this.lastName = updatedUser.lastName;
        this.gender = updatedUser.gender;
    }

    public void addUserRole(String role) {
        this.addUserRole(new UserRole(this, role));
    }

    @Override
    public String toString() {
        return "username = " + this.username;
    }
}
