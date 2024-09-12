package com.codegym.netflix.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "title_avatar")
public class TitleAvatarEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @OneToMany (mappedBy = "titleAvatar")
    private List<AvatarsEntity> avatars;

    public TitleAvatarEntity() {
    }

    public TitleAvatarEntity(Long id, String title, List<AvatarsEntity> avatars) {
        this.id = id;
        this.title = title;
        this.avatars = avatars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<AvatarsEntity> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<AvatarsEntity> avatars) {
        this.avatars = avatars;
    }
}
