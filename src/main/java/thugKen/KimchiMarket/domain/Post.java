package thugKen.KimchiMarket.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {
    private int postId;
    private int writer;
    private int price;
    private String postTitle;
    private String context;
    private java.util.Date date;


}
