package io.metersphere.track.request.testplan;

import io.metersphere.controller.request.OrderRequest;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class QueryTestPlanRequest extends TestPlanRequest {
    private String workspaceId;
    private List<OrderRequest> orders;
    private Map<String, List<String>> filters;
}
