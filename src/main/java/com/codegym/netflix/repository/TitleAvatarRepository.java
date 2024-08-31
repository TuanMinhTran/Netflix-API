package com.codegym.netflix.repository;

import com.codegym.netflix.entity.TitleAvatarEntity;
import org.springframework.data.repository.CrudRepository;

public interface TitleAvatarRepository extends CrudRepository<TitleAvatarEntity, Long> {
}
