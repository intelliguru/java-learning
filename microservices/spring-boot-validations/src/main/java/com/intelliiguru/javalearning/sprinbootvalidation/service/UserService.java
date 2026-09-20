package com.intelliiguru.javalearning.sprinbootvalidation.service;

import com.intelliiguru.javalearning.sprinbootvalidation.dto.UserRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {
    private final ProductService productService;
    //private final ProductService productService;
    //private final ProductService productService;
    //private final ProductService productService;
    public UserService(ProductService productService) {

        this.productService = productService;
        //this.productService = productService;
        //this.productService = productService;
        //this.productService = productService;
    }

    public boolean saveUserToDB(UserRequestDTO userRequestDTO) {
        boolean result = false;
        if(StringUtils.isNoneEmpty(userRequestDTO.getName())){
            boolean validAge = productService.isValidAge(userRequestDTO.getAge());
            if(validAge) {
                // actual call
                log.info("Validation Successful!!! :) and Data saved to Database");
                result = true;
            }
        }
        return result;
    }
}
