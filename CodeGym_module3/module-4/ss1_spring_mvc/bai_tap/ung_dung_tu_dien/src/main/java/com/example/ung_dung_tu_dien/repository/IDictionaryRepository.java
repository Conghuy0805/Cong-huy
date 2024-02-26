package com.example.ung_dung_tu_dien.repository;

import com.example.ung_dung_tu_dien.model.Dictionary;

import java.util.List;

public interface IDictionaryRepository {
    List<Dictionary> findAll();
}
