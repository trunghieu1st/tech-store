package com.example.hieustore.domain.dto.request;

import com.example.hieustore.constant.ErrorMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaymentMethodsRequestDto {
    @NotBlank(message = ErrorMessage.NOT_BLANK_FIELD)
    private String code;

    @NotBlank(message = ErrorMessage.NOT_BLANK_FIELD)
    private String name;

    private MultipartFile avatar;

    @NotBlank(message = ErrorMessage.NOT_BLANK_FIELD)
    private String description;

    @NotNull(message = ErrorMessage.INVALID_SOME_THING_FIELD_IS_REQUIRED)
    private Boolean status;
}
