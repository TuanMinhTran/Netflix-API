package com.codegym.netflix.repository;

import com.codegym.netflix.entity.PackageEntity;
import org.springframework.data.repository.CrudRepository;

public interface PackageRepository extends CrudRepository<PackageEntity, Long> {
}
