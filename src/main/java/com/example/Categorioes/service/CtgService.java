package com.example.Categorioes.service;

import com.example.Categorioes.dto.CtgDTO;
import com.example.Categorioes.entity.Ctg;
import com.example.Categorioes.repo.CtgRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CtgService
{   @Autowired
    private CtgRepo ctgRepo;

    @Autowired
   private ModelMapper modelMapper;

    public CtgDTO saveCtg(CtgDTO ctgDTO){
         ctgRepo.save(modelMapper.map(ctgDTO, Ctg.class));
         return ctgDTO;
    }

}
