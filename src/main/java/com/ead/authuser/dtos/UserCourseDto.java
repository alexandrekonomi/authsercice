package com.ead.authuser.dtos;

import lombok.Data;

import java.util.UUID;

@Data
public class UserCourseDto {
private UUID userId;
private UUID courseId;

}
