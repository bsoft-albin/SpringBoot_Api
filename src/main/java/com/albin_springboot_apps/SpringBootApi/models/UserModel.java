package com.albin_springboot_apps.SpringBootApi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserModel {
    private Long id;
    private String name;
    private String email;
}
