package com.codegym.netflix.entity;

import javax.persistence.*;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "user_email"))
public class UserEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_email")
    private String email;

    @Column(name = "user_password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "package_id")
    private PackageEntity packageEntity;

    @Column(name = "nickname")
    private String nickname;

    public UserEntity() {
    }

    public UserEntity(Long id, String email, String password, String nickname, PackageEntity packageEntity) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.packageEntity = packageEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PackageEntity getPackageEntity() {
        return packageEntity;
    }

    public void setPackageEntity(PackageEntity packageEntity) {
        this.packageEntity = packageEntity;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
