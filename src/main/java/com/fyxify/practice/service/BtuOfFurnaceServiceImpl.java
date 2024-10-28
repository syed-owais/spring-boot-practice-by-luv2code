package com.fyxify.practice.service;

import com.fyxify.practice.dao.BtuOfFurnaceDAO;
import com.fyxify.practice.entity.BtuOfFurnace;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BtuOfFurnaceServiceImpl implements BtuOfFurnaceService {

    private BtuOfFurnaceDAO btuOfFurnaceDAO;

    public BtuOfFurnaceServiceImpl(BtuOfFurnaceDAO btuOfFurnaceDAO) {
        this.btuOfFurnaceDAO = btuOfFurnaceDAO;
    }

    public List<BtuOfFurnace> findAll() {
        return btuOfFurnaceDAO.findAll();
    }

    @Override
    public BtuOfFurnace findById(long id) {
        return btuOfFurnaceDAO.findById(id);
    }

    @Override
    @Transactional
    public BtuOfFurnace upsert(BtuOfFurnace btuOfFurnace) {
        return btuOfFurnaceDAO.upsert(btuOfFurnace);
    }

    @Override
    @Transactional
    public void delete(long id) {
        btuOfFurnaceDAO.delete(id);
    }
}
