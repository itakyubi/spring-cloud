package com.wa.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * MyFilter
 * 2023/3/2 9:44 上午
 *
 * @author wuao
 */

@Component
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.PRE_DECORATION_FILTER_ORDER + 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String accessToken = request.getParameter("accessToken");
        if (StringUtils.isEmpty(accessToken)) {
            //setSendZuulResponse(false)令zuul过滤该请求，不进行路由
            currentContext.setSendZuulResponse(false);
            //设置返回的错误码
            currentContext.setResponseStatusCode(401);
            currentContext.setResponseBody("AccessToken is null");
            return null;
        } else {
            // 否则正常执行业务逻辑.....
            System.out.println("获取到AccessToken为:" + accessToken);
        }
        return null;
    }
}
