package com.syphan.practice.dto.registration;

import com.syphan.practice.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PermissionCreateDto extends BaseDto {
    @NotBlank(message = "name.must.not.be.blank")
    private String name;

    @NotBlank(message = "code.must.not.be.blank")
    private String code;
}
