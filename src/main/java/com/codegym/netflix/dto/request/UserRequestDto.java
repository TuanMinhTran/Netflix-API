package com.codegym.netflix.dto.request;

import javax.validation.constraints.*;

public class UserRequestDto {
    @NotBlank(message = "Trường email phải có giá trị")
    @Email(message = "Email không hợp lệ")
    private String email;

    @NotNull(message = "Bạn chưa nhập mật khẩu")
    @Size(min = 8, message = "Mật khẩu phải từ 8 kí tự trở lên")
    private String password;

    public UserRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
