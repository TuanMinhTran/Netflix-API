package com.codegym.netflix.dto.request;

import javax.validation.constraints.*;

public class UserRequestDto {
    @NotBlank(message = "Trường email phải có giá trị")
    @Email(message = "Email không hợp lệ")
    private String email;

    @NotNull(message = "Bạn chưa nhập mật khẩu")
    @Size(min = 8, message = "Mật khẩu phải từ 8 kí tự trở lên")
    private String password;

    private String nickname;

    public UserRequestDto(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
