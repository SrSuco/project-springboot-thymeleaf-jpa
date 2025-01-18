package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class GifterGift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "gift_id", nullable = false)
    private Gift gift;

    @ManyToOne
    @JoinColumn(name = "gifter_id", nullable = false)
    private Gifter gifter;

    private Boolean favoriteStatus;

    @Column(nullable = false)
    private Boolean purchaseStatus = false;

    private String approvalStatus;

    @Column(nullable = false)
    private Integer status;

    @Column(nullable = false)
    private LocalDate createdAt;

    @Column(nullable = false)
    private LocalDate updatedAt;

    @Column(nullable = false)
    private Long userUpdated;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDate.now();
        updatedAt = LocalDate.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDate.now();
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    public Gifter getGifter() {
        return gifter;
    }

    public void setGifter(Gifter gifter) {
        this.gifter = gifter;
    }

    public Boolean getFavoriteStatus() {
        return favoriteStatus;
    }

    public void setFavoriteStatus(Boolean favoriteStatus) {
        this.favoriteStatus = favoriteStatus;
    }

    public Boolean getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(Boolean purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public Long getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(Long userUpdated) {
        this.userUpdated = userUpdated;
    }
}