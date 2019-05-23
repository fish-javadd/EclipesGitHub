package com.github.fish56;

import org.eclipse.egit.github.core.client.GitHubClient;
import org.junit.Before;
import org.junit.BeforeClass;

public class ApplicationTest {
    private static String token = "5a74846b0deccf7ac8a25ea23feae96cd0d74902";

    protected static GitHubClient gitHubClient;

    @BeforeClass
    public static void init(){
        // 创建客户端
        gitHubClient = new GitHubClient();

        // 设置请求用的token
        gitHubClient.setOAuth2Token(token);
    }
}
