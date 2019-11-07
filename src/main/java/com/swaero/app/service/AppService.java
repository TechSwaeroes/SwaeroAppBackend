package com.swaero.app.service;

import com.swaero.app.model.Swaero;
import com.swaero.app.repository.SwearoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AppService {
    @Autowired
    private SwearoRepository swearoRepository;

    public List<Swaero> findAll() {
        return swearoRepository.findAll();
    }

    public Swaero save(Swaero swaero ) {
        return swearoRepository.save(swaero);
    }

}
