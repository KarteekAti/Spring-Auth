package com.springauth.SpringAuth.model.User;

import com.springauth.SpringAuth.model.UID;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collation = "User")
public class User {

    @Indexed
    @Id
    private String Id;

    @NotBlank
    @Email
    @Size(max = 25)
    private String email;

    @NotBlank
    private String password;
    private UserRoles role;

    public User() {
        this.Id = UID.generate();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserRoles getRole() {
        return role;
    }

    public void setRole(UserRoles role) {
        this.role = role;
    }
}

