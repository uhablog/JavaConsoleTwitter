package model;

public class Tweet {

    private String content;
    private String username;

    public Tweet(String content, String username) {
        this.content = content;
        this.username = username;
    }

    public void outputTweet() {
        System.out.println("ユーザー名：" + this.username);
        System.out.println("ツイート：" + this.content);
        System.out.println();
    }
}
