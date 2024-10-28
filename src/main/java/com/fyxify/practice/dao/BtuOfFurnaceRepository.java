package com.fyxify.practice.dao;

import com.fyxify.practice.entity.BtuOfFurnace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "btu-of-furnaces")
public interface BtuOfFurnaceRepository extends JpaRepository<BtuOfFurnace, Long> {
}
