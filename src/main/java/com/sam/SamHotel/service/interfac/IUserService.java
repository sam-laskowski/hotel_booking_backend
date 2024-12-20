package com.sam.SamHotel.service.interfac;

import com.sam.SamHotel.dto.LoginRequest;
import com.sam.SamHotel.dto.Response;
import com.sam.SamHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
