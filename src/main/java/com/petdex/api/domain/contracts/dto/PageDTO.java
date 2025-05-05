package com.petdex.api.domain.contracts.dto;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PageDTO {

    private int page;
    private int size;
    private String sortBy;
    private String direction;

    public PageDTO() {
    }

    public PageDTO(int page, int size) {
        this.page = page;
        this.size = size;
    }

    public PageDTO(int page, int size, String sortBy, String direction) {
        this.size = size;
        this.page = page;
        this.sortBy = sortBy;
        this.direction = direction;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getPage() {
        return page;
    }

    public String getSortBy() {
        return sortBy;
    }

    public String getDirection() {
        return direction;
    }


    public Pageable mapPage() {

        if(this.sortBy != null) {
            Sort sort = direction.equalsIgnoreCase("asc") ?
                    Sort.by(this.sortBy).ascending() :
                    Sort.by(this.sortBy).descending();
            return  PageRequest.of(this.page, this.size, sort);
        }

        return PageRequest.of(this.page, this.size);
    }

}
