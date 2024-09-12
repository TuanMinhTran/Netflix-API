package com.codegym.netflix.entity;

import javax.persistence.*;

@Entity
@Table(name = "avatars")
public class AvatarsEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "avatar_url")
    private String avatarUrl;

    @ManyToOne
    @JoinColumn(name = "title_avatar_id")
    private TitleAvatarEntity titleAvatar;

    public AvatarsEntity() {
    }

    public AvatarsEntity(Long id, String avatarUrl, TitleAvatarEntity titleAvatar) {
        this.id = id;
        this.avatarUrl = avatarUrl;
        this.titleAvatar = titleAvatar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public TitleAvatarEntity getTitleAvatar() {
        return titleAvatar;
    }

    public void setTitleAvatar(TitleAvatarEntity titleAvatar) {
        this.titleAvatar = titleAvatar;
    }
}
