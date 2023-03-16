package com.baomidou.mybatisplus.samples.enums.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author miemie
 * @since 2020-06-12
 */
@Getter
@AllArgsConstructor
public enum StrEnum {

    /**
     * 一
     */
    ONE("one"),
    TWO("two");

    @EnumValue
    private final String value;
}
