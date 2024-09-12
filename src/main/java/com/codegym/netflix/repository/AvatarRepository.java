package com.codegym.netflix.repository;

import com.codegym.netflix.entity.AvatarsEntity;
import org.springframework.data.repository.CrudRepository;

public interface AvatarRepository extends CrudRepository<AvatarsEntity, Long> {
}
