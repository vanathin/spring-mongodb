package com.learning.springmongodb.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Setter
@Getter
@Component
public class Response<T> {

    private int start;

    private int limit;

    private int size;

    private boolean sort;

    private long totalCount;

    public List<T> myList = new ArrayList<>();

}
