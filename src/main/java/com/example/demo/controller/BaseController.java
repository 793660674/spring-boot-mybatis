package com.example.demo.controller;

import java.util.Date;

import com.common.JsonResult;


/**
 * Author: tj
 * Email: houatj@163.com
 * Describe: 基础控制器
 */
public class BaseController {
    /**
     * 渲染失败数据
     *
     * @return result
     */
    protected JsonResult renderError() {
        JsonResult result = new JsonResult();
        result.setSuccess(false);
        result.setStatus("500");
        result.setTime(new Date().getTime());
        return result;
    }

    /**
     * 渲染失败数据（带消息）
     *
     * @param msg 需要返回的消息
     * @return result
     */
    protected JsonResult renderError(String msg) {
        JsonResult result = renderError();
        result.setMsg(msg);
        result.setTime(new Date().getTime());
        return result;
    }

    /**
     * 渲染成功数据
     *
     * @return result
     */
    protected JsonResult renderSuccess() {
        JsonResult result = new JsonResult();
        result.setSuccess(true);
        result.setStatus("200");
        result.setTime(new Date().getTime());
        return result;
    }

    /**
     * 渲染成功数据（带信息）
     *
     * @param msg 需要返回的信息
     * @return result
     */
    protected JsonResult renderSuccess(String msg,String resultCode) {
        JsonResult result = renderSuccess();
        result.setMsg(msg);
        result.setTime(new Date().getTime());
        return result;
    }

    /**
     * 渲染成功数据（带数据）
     *
     * @param obj 需要返回的对象
     * @return result
     */
    protected JsonResult renderSuccess(Object obj) {
        JsonResult result = renderSuccess();
        result.setObj(obj);
        result.setTime(new Date().getTime());
        return result;
    }
}
