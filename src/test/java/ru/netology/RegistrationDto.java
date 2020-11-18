package ru.netology;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationDto extends File {

    public RegistrationDto(String vasya, String password, String active) {
        super("","");
        $("[data-test-id=name].input_type_text .input__control").setValue(vasya);

    }
}
