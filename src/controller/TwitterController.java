package controller;

import manager.TweetManager;
import manager.UserManager;
import model.User;

import java.util.Scanner;

public class TwitterController {

    private UserManager userManager;
    private TweetManager tweetManager;
    private String loginUsername;

    public TwitterController(){

        this.userManager = new UserManager();
        this.tweetManager = new TweetManager();
    }

    public void start() {
        System.out.println("Twitter(Java Console版)へようこそ！");
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("実行する操作を選択してください。");
            System.out.println("1:ユーザー登録");
            System.out.println("2:ログインする");
            System.out.println("3:ログアウトする");
            System.out.println("4:ツイートする");
            System.out.println("5:ツイートの一覧表示をする");
            System.out.println("6:Twitterを終了する");

            String nextAction = scanner.nextLine();

            if ("6".equals(nextAction)) {
                break;
            }

            switch (nextAction){
                case "1":
                    userManager.userRegister(scanner);
                    break;
                case "2":
                    this.loginUsername = userManager.login(scanner);
                    break;
                case "3":
                    this.loginUsername = null;
                    break;
                case "4":
                    if (this.loginUsername == null) {
                        System.out.println("ログインしてください");
                        break;
                    }
                    tweetManager.tweet(scanner, this.loginUsername);
                    break;
                case "5":
                    tweetManager.outputTweetList();
                    break;
            }
        }

        scanner.close();
    }
}
