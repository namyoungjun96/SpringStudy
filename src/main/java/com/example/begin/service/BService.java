package com.example.begin.service;

import com.example.begin.dao.CRepository;
import com.example.begin.dto.DBoxDTO;
import com.example.begin.model.DBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class BService {
    @Autowired
    CRepository cRepository;

    public DBoxDTO Service() throws SQLException, ClassNotFoundException {
        //DBox dBox=cRepository.Repository("cat");
        //DBoxDTO dBoxDTO=new DBoxDTO();
        //dBoxDTO.setUser_id(dBox.getUser_id());
        //dBoxDTO.setUser_name(dBox.getUser_name());
        //return dBoxDTO;

        DBoxDTO dBoxDTOSet=cRepository.Repository("cat");
        DBoxDTO dBoxDTOGet=new DBoxDTO();
        dBoxDTOGet.setUser_id(dBoxDTOSet.getUser_id());
        dBoxDTOGet.setUser_name(dBoxDTOSet.getUser_name());

        return dBoxDTOGet;
    }
}
