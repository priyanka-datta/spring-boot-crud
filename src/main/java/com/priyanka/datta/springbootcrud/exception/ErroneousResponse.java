package com.priyanka.datta.springbootcrud.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErroneousResponse {

    private String errorCode;
    private String errorMessage;
}
