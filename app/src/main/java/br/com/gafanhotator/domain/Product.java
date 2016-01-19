package br.com.gafanhotator.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by vitor on 14/01/2016.
 */
public class Product implements Serializable{

    /**
     * Generated
     */
    private static final long serialVersionUID = 6190249970477627347L;

    private Long id;

    private String searchText;

    private String textToSearch;

    private boolean regEx = false;

    private Date beginDate;

    private Date expirationDate;

    private BigDecimal maximumValue;

    private User user;

    public String getSearchText() {
        return searchText;
    }

    public boolean getRegEx() {
        return regEx;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public BigDecimal getMaximumValue() {
        return maximumValue;
    }

    public User getUser() {
        return this.user;
    }

    public Long getId() {
        return id;
    }

    public String getTextToSearch() {
        return textToSearch;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void update(Product updatedProduct) {
        this.searchText = updatedProduct.searchText;
        this.textToSearch = updatedProduct.textToSearch;
        this.beginDate = updatedProduct.beginDate;
        this.expirationDate = updatedProduct.expirationDate;
        this.maximumValue = updatedProduct.maximumValue;
        this.textToSearch = updatedProduct.getSearchText().toLowerCase();
    }

    public void setUser(User user) {
        this.user = user;
    }
}
