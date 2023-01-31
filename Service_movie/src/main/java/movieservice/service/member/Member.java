package movieservice.service.member;

import lombok.Data;

import java.util.Date;

@Data
public class Member {

    private String id;          // 유저 고유 아이디
    private String userId;      // 유저 로그인 아이디
    private String userPwd;     // 유저 로그인 비밀번호
    private Date joinDate;      // 유저 가입일자

    public Member() {
    }

    public Member(String userId, String userPwd, Date joinDate) {
        this.userId = userId;
        this.userPwd = userPwd;
        this.joinDate = joinDate;
    }
}