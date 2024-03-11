package thugKen.KimchiMarket.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Member {
        private int MemberId;
        private String name;
        private String username;
        private String password;
        private List<Post> posts;
        private char memberGrade;

}
