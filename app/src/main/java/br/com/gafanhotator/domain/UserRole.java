package br.com.gafanhotator.domain;

import java.io.Serializable;

/**
 * Created by vitor on 14/01/2016.
 */
public class UserRole implements Serializable {

    private static final long serialVersionUID = 6190245270477627347L;

    private Long id;
    private User user;
    private String authority;

    public UserRole(){}

    public UserRole(Long id, User user, String authority) {
        this.id = id;
        this.user = user;
        this.authority = authority;
    }

    public UserRole(User user, String authority) {
        this.user = user;
        this.authority = authority;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
