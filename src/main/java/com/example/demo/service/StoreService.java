package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@SessionScope

public class StoreService {
    private final List<Long> ids;
    public StoreService(){
        ids=new ArrayList<>();
    }
    public void add(List<Long> ids){
        this.ids.addAll(ids);
    }
    public List<Long>get(){
    return Collections.unmodifiableList(ids);
    }
}
