package com.itmuch.cloud.study.filters.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.*;
import java.util.Map;

public class PostRespLogFilter extends ZuulFilter {
  private static final Logger LOGGER = LoggerFactory.getLogger(PostRespLogFilter.class);

  @Override
  public String filterType() {
    return "post";
  }

  @Override
  public int filterOrder() {
    return 1000;
  }

  @Override
  public boolean shouldFilter() {
    // todo: return true;
    return false;
  }

  public PostRespLogFilter() {
  }

  static String convertStreamToString(java.io.InputStream is) {
    java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
    return s.hasNext() ? s.next() : "";
  }

  @Override
  public Object run() {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest request = ctx.getRequest();
    HttpServletResponse response = ctx.getResponse();
    // todo: dump request and response with reflect

    return null;
  }
}
