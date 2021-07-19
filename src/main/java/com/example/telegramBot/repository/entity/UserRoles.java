package com.example.telegramBot.repository.entity;

import java.io.Serializable;

public enum UserRoles implements Serializable {

        ROLE_ADMIN,
        ROLE_USER,
        ROLE_STUDENT,
        ROLE_TEACHER;

        UserRoles(){        }

    }

