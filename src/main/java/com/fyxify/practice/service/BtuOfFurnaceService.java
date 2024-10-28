package com.fyxify.practice.service;

import com.fyxify.practice.entity.BtuOfFurnace;

import java.util.List;

public interface BtuOfFurnaceService {

    List<BtuOfFurnace> findAll();

    BtuOfFurnace findById(long id);

    BtuOfFurnace upsert(BtuOfFurnace btuOfFurnace);

    void delete(long id);
}
