package com.github.fish56;

import com.alibaba.fastjson.JSONObject;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.service.RepositoryService;
import org.junit.Test;

public class RepositoryTest extends ApplicationTest {
    private static RepositoryService repositoryService =
            new RepositoryService(gitHubClient);
    @Test
    public void getRepository() throws Exception{
        Repository vue = repositoryService.getRepository("vuejs", "vue");
        System.out.println(JSONObject.toJSONString(vue, true));
    }
}
