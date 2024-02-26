package com.example.ung_dung_tu_dien.repository;

import com.example.ung_dung_tu_dien.model.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    private static final Map<Integer, Dictionary> list = new HashMap<>();

    static {
        list.put(1, new Dictionary("hello", "xin chào"));
        list.put(2, new Dictionary("dog", "con chó"));
        list.put(3, new Dictionary("love", "yêu"));
        list.put(4, new Dictionary("father", "bố"));
        list.put(5, new Dictionary("mother", "mẹ"));
    }

    @Override
    public List<Dictionary> findAll() {
        return new ArrayList<>(list.values());
    }
}
