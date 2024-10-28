package com.fyxify.practice.dao;

import com.fyxify.practice.entity.BtuOfFurnace;

import java.util.List;

public interface BtuOfFurnaceDAO {

    List<BtuOfFurnace> findAll();

    BtuOfFurnace findById(long id);

    BtuOfFurnace upsert(BtuOfFurnace btuOfFurnace);

    void delete(long id);
}
