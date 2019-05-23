package com.github.fish56;

import com.alibaba.fastjson.JSONObject;
import org.eclipse.egit.github.core.Issue;
import org.eclipse.egit.github.core.RepositoryIssue;
import org.eclipse.egit.github.core.service.IssueService;
import org.junit.Test;

import java.util.List;

public class IssueTest extends ApplicationTest {
    private static IssueService issueService =
            new IssueService(gitHubClient);

    @Test
    public void getIssues() throws Exception{
        List<RepositoryIssue> issues = issueService.getIssues();
        System.out.println(JSONObject.toJSONString(issues, true));
    }

    /**
     * 获得某个仓库的所有issues
     * @throws Exception
     */
    @Test
    public void getRepoIssues() throws Exception{
        List<Issue> issues = issueService.getIssues("vuejs", "vue", null);
        System.out.println(JSONObject.toJSONString(issues, true));
    }
    /**
     * 获得某个仓库的某个issue
     * @throws Exception
     */
    @Test
    public void getRepoIssue() throws Exception{
        Issue issue = issueService.getIssue("vuejs", "vue", 1220);
        System.out.println(JSONObject.toJSONString(issue, true));
    }
}
