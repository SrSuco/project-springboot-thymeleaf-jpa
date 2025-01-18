package com.project_springboot_thymeleaf_jpa.project_springboot_thymeleaf_jpa.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Gifter {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private UUID giftedAdminId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private String accessToken;

    private String accessLink;

    @OneToMany(mappedBy = "gifter")
    private List<Purchase> gifterPurchases;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private UUID userUpdated;

    @PrePersist
    public void prePersist() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    public void preUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public Gifter() {
    }

    public Gifter(UUID giftedAdminId, String name, String email) {
        this.giftedAdminId = giftedAdminId;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getGiftedAdminId() {
        return giftedAdminId;
    }

    public void setGiftedAdminId(UUID giftedAdminId) {
        this.giftedAdminId = giftedAdminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessLink() {
        return accessLink;
    }

    public void setAccessLink(String accessLink) {
        this.accessLink = accessLink;
    }

    public List<Purchase> getGifterPurchases() {
        return gifterPurchases;
    }

    public void setGifterPurchases(List<Purchase> gifterPurchases) {
        this.gifterPurchases = gifterPurchases;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public UUID getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(UUID userUpdated) {
        this.userUpdated = userUpdated;
    }
}