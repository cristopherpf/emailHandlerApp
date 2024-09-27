package com.email.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class EmailDto {

    @JsonProperty("proprietario")
    @NotBlank
    private String ownerRef;
    @JsonProperty("remetente")
    @NotBlank
    @Email
    private String emailFrom;
    @JsonProperty("destinatario")
    @NotBlank
    @Email
    private String emailTo;
    @JsonProperty("assunto")
    @NotBlank
    private String subject;
    @JsonProperty("conteudo")
    @NotBlank
    private String text;

}
