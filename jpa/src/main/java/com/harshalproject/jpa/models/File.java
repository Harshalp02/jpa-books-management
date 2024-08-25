package com.harshalproject.jpa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data

@AllArgsConstructor
@SuperBuilder
public class File {
    private String type;
}
