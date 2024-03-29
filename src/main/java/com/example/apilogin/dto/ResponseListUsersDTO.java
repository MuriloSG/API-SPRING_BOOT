package com.example.apilogin.dto;

import com.example.apilogin.domain.user.User;

public record ResponseListUsersDTO(String user_id, String name, String email) {
    public ResponseListUsersDTO(User user){
        this(user.getUser_id(), user.getName(), user.getEmail());
    }
}
