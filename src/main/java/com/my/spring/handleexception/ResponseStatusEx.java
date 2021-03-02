package com.my.spring.handleexception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN, reason = "错了")
public class ResponseStatusEx extends RuntimeException {

}
