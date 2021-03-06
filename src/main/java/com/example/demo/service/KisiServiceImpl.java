package com.example.demo.service;

import com.example.demo.model.Kisi;
import com.example.demo.repository.KisiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KisiServiceImpl implements KisiService {

    @Autowired
    KisiRepository kisiRepository;



    @Override
    public void save(Kisi kisi) {
        kisiRepository.save(kisi);
    }

    @Override
    public Kisi findByKullaniciAdi(String username) {
        return kisiRepository.findByKullaniciAdi(username);
    }

    @Override

    public Kisi findById(Long id) {
        return kisiRepository.findbyId(id);
    }
    @Override
    public Kisi findBySifre(String sifre) {
        return kisiRepository.findBySifre(sifre);
    }

    @Override
    public int toplamKullanici() {
        return kisiRepository.toplamKullanici();
    }

    @Override
    public List<Kisi> findAll() {
        return kisiRepository.findAll();
    }
}