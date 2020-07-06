package com.learning.springmongodb.bean;

import com.mongodb.lang.NonNull;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
@Data
@Getter
@ApiModel(value = "Info about Product")
public class Product {

    @Id
    private String id;

    @TextIndexed
    @NonNull
    private String name;

    @TextIndexed
    private String description;
}
