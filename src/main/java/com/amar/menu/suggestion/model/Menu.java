package com.amar.menu.suggestion.model;




import javax.persistence.*;

@Entity
@Table(name="menu")

public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "businessid")
    private String businessId ;
    @Column(name = "businessName")
    private String businessName;
    @Column(name = "businessType")
    private String businessType;
    @Column(name = "addressLine1")
    private String addressLine1;
    @Column(name = "addressLine2")
    private String addressLine2;
    @Column(name = "postcode")
    private String postcode;
    @Column(name = "longitude")
    private String longitude;
    @Column(name = "latitude")
    private String latitude;
    @Column(name = "ratingValue")
    private String ratingValue;
    @Column(name = "menuSuggestion")
    private String menuSuggestion;

    /*@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private UserProfile userProfile;
*/
    public Menu() {

    }

    public Menu(long id, String businessId, String businessName, String businessType, String addressLine1, String addressLine2, String postcode, String longitude, String latitude, String ratingValue, String menuSuggestion) {
        this.id = id;
        this.businessId = businessId;
        this.businessName = businessName;
        this.businessType = businessType;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.postcode = postcode;
        this.longitude = longitude;
        this.latitude = latitude;
        this.ratingValue = ratingValue;
        this.menuSuggestion = menuSuggestion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(String ratingValue) {
        this.ratingValue = ratingValue;
    }

    public String getMenuSuggestion() {
        return menuSuggestion;
    }

    public void setMenuSuggestion(String menuSuggestion) {
        this.menuSuggestion = menuSuggestion;
    }
}
