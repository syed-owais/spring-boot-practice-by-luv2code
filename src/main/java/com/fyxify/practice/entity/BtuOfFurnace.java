package com.fyxify.practice.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(schema = "core", name = "btu_of_furnace")
public class BtuOfFurnace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "btu")
    private Integer btu;

    @Column(name = "btu_formatted")
    private String btuFormatted;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public BtuOfFurnace() {
    }

    public BtuOfFurnace(String title, Integer btu, String btuFormatted, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.title = title;
        this.btu = btu;
        this.btuFormatted = btuFormatted;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getBtu() {
        return btu;
    }

    public void setBtu(Integer btu) {
        this.btu = btu;
    }

    public String getBtuFormatted() {
        return btuFormatted;
    }

    public void setBtuFormatted(String btuFormatted) {
        this.btuFormatted = btuFormatted;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "BtuOfFurnace{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", btu=" + btu +
                ", btuFormatted='" + btuFormatted + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
