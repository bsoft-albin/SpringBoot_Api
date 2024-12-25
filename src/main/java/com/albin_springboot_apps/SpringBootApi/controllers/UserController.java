package com.albin_springboot_apps.SpringBootApi.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;
import com.albin_springboot_apps.SpringBootApi.models.UserModel;

@RestController
@RequestMapping("api/user/")
public class UserController {
    // Static data: List of records
    private static final List<UserModel> records = Arrays.asList(
            new UserModel(1L, "Albin Anthony", "albintony2002@gmail.com"),
            new UserModel(2L, "Michael", "mike@gmail.com"),
            new UserModel(3L, "Jeeva", "jeeva@gmail.com"),
            new UserModel(3L, "Nelson", "nelson@gmail.com"));

    // Endpoint to get all records
    @GetMapping("/get-all-users")
    public List<UserModel> getAllRecords() {
        return records;
    }

    // Endpoint to get a single record by ID
    @GetMapping("get-single-user/{id}")
    public UserModel getRecordById(@PathVariable("id") Long id) {
        // Find the record by ID from static data
        Optional<UserModel> record = records.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst();

        // Return the record if found, or null (which results in a 404)
        return record.orElse(null);
    }
}
