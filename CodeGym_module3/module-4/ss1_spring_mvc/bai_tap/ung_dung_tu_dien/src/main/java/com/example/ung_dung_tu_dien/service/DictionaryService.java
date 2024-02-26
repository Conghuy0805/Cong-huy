package com.example.ung_dung_tu_dien.service;

import com.example.ung_dung_tu_dien.model.Dictionary;
import com.example.ung_dung_tu_dien.repository.DictionaryRepository;
import com.example.ung_dung_tu_dien.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    private IDictionaryRepository iDictionaryRepository;

    @Override
    public List<Dictionary> findAll() {
        return iDictionaryRepository.findAll();
    }
}
