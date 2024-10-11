package com.keduit.show.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PostSearchDTO {

    private String searchDateType;

    private String searchBy;

    private String searchQuery = "";

}