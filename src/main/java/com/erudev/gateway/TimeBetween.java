package com.erudev.gateway;

import lombok.Data;

import java.time.LocalTime;

/**
 * @author pengfei.zhao
 * @date 2020/11/8 15:39
 */
@Data
public class TimeBetween {
    private LocalTime start;
    private LocalTime end;
}
