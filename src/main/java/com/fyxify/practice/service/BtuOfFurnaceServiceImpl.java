package com.fyxify.practice.service;

import com.fyxify.practice.dao.BtuOfFurnaceRepository;
import com.fyxify.practice.entity.BtuOfFurnace;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BtuOfFurnaceServiceImpl implements BtuOfFurnaceService {

    private BtuOfFurnaceRepository btuOfFurnaceRepository;

    public BtuOfFurnaceServiceImpl(BtuOfFurnaceRepository btuOfFurnaceDAO) {
        this.btuOfFurnaceRepository = btuOfFurnaceDAO;
    }

    public List<BtuOfFurnace> findAll() {
        return btuOfFurnaceRepository.findAll();
    }

    @Override
    public BtuOfFurnace findById(long id) {
        Optional<BtuOfFurnace> btuOfFurnace = btuOfFurnaceRepository.findById(id);
        if (btuOfFurnace.isPresent()) {
            return btuOfFurnace.get();
        } else {
            throw new RuntimeException("Btu not found with id " + id);
        }
    }

    @Override
    public BtuOfFurnace upsert(BtuOfFurnace btuOfFurnace) {
        return btuOfFurnaceRepository.save(btuOfFurnace);
    }

    @Override
    public void delete(long id) {
        btuOfFurnaceRepository.deleteById(id);
    }
}
