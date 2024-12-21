package com.example.Categorioes.controller;

import com.example.Categorioes.dto.CtgDTO;
import com.example.Categorioes.service.CtgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@CrossOrigin
public class CtgController {

    @Autowired
    private CtgService ctgService;

    @GetMapping("/getCtg")
    public String getCtg() {
        return "simple root";
    }

    @PostMapping("/saveCtg")
    public CtgDTO saveCtg(@RequestBody CtgDTO ctgDTO)
    {
        return ctgService.saveCtg(ctgDTO);
    }

    @PutMapping("/updateCtg")
    public String updateCtg() {
        return "update Ctg";
    }
}
