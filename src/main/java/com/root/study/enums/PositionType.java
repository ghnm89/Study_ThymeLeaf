package com.root.study.enums;

import lombok.Getter;

@Getter
public enum PositionType {
    DEVELOPER("1", "Developer"),
    ACCOUNTANT("2", "Accountant"),
    SYSTEM_ARCHITECT("3", "System Architect");

    private final String code;
    private final String name;

    PositionType(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public static String codeOf(String code) {
        for (PositionType type : PositionType.values()) {
            if (type.code.equals(code)) {
                return type.getName();
            }
        }

        return null;
    }
}
