package com.fyxify.practice.rest;

import com.fyxify.practice.entity.BtuOfFurnace;
import com.fyxify.practice.service.BtuOfFurnaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/btu-of-furnaces")
public class BTUOfFurnaceController {

    private final BtuOfFurnaceService btuOfFurnaceService;

    public BTUOfFurnaceController(BtuOfFurnaceService btuOfFurnaceService) {
        this.btuOfFurnaceService = btuOfFurnaceService;
    }

    @GetMapping
    public List<BtuOfFurnace> getBtuOfFurnaces() {
        return btuOfFurnaceService.findAll();
    }

    @GetMapping(path = "/{id}")
    public BtuOfFurnace getBtuOfFurnaceById(@PathVariable long id) {
        BtuOfFurnace btuOfFurnace = btuOfFurnaceService.findById(id);
        if (btuOfFurnace == null) {
            throw new RuntimeException("Btu of Furnace not found by the id: " + id);
        }
        return btuOfFurnace;
    }

    @PostMapping
    public BtuOfFurnace save(@RequestBody BtuOfFurnace btuOfFurnace) {
        btuOfFurnace.setId(0);
        BtuOfFurnace newBtuOfFurnace = btuOfFurnaceService.upsert(btuOfFurnace);
        return newBtuOfFurnace;
    }

    @PutMapping
    public BtuOfFurnace update(@RequestBody BtuOfFurnace btuOfFurnace) {
        BtuOfFurnace newBtuOfFurnace = btuOfFurnaceService.upsert(btuOfFurnace);
        return newBtuOfFurnace;
    }

    @DeleteMapping(path = "{id}")
    public String delete(@PathVariable long id) {
        BtuOfFurnace btuOfFurnace = btuOfFurnaceService.findById(id);
        if (btuOfFurnace == null) {
            throw new RuntimeException("Btu of Furnace not found by the id: " + id);
        }
        btuOfFurnaceService.delete(id);
        return "Deleted BtuOfFurnace with id: " + id;
    }

}
