package com.petdex.api.domain.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "batimentos")
public class Batimento {
    @Id
    private String id;
    private Date data;
    private Integer frequenciaMedia;
}
