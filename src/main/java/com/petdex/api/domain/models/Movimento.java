package com.petdex.api.domain.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "movimentos")
public class Movimento {
    @Id
    private String id;
    private Date date;
    private Double acelerometroX;
    private Double acelerometroY;
    private Double acelerometroZ;
    private Double giroscopioX;
    private Double giroscopioY;
    private Double giroscopioZ;
    private String animalId;
    private String coleiraId;

}
