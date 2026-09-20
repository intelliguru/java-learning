package com.intelliiguru.javalearning.sprinbootvalidation.service;

import com.intelliiguru.javalearning.sprinbootvalidation.dto.UserAddressDTO;
import com.intelliiguru.javalearning.sprinbootvalidation.dto.UserRequestDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private ProductService mockedProductService;

//    @Mock
//    private ProductService mockedProductService;
//
//    @Mock
//    private ProductService mockedProductService;
//
//    @Mock
//    private ProductService mockedProductService;

    private UserService userService;

    @BeforeEach
    void setUp() {
         userService = new UserService(mockedProductService);
    }

    @Test
    @DisplayName("Should Successfully Save the User Data into Database")
    void checkIfDataSaved(){
        //Arrange
        try {
            UserRequestDTO userRequestDTO = UserRequestDTO.builder()
                    .age(2)
                    .email("hariomji@email.com")
                    .name("Hariom Tiwari")
                    .userAddress(UserAddressDTO.builder()
                            .city("Nagpur")
                            .state("Maharashtra")
                            .landMark("Near LP Hotel")
                            .street("Kuchh Bhi")
                            .zipCode("440013")
                            .build())
                    .department("Computer Science")
                    .location("Nagpur")
                    .password("Tiwari@123456789")
                    .phoneNumber("9988776655")
                    .build();

            //Act
            when(mockedProductService.isValidAge(anyInt())).thenReturn(true);
            userService = new UserService(mockedProductService);
            boolean result = userService.saveUserToDB(userRequestDTO);

            //Assert
            Assertions.assertTrue(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}