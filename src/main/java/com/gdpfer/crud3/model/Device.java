package com.gdpfer.crud3.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
public class Device extends AuditModel implements Serializable {
    private String name;
    private String macAddress;

}
