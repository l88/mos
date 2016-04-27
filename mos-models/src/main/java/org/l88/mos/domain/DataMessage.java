package org.l88.mos.domain;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 数据报文信息
 * 
 * @author liangbl
 * 
 */
public interface DataMessage {
    /**
     * 单个记录包(如：LTTS)的数组名称
     */
    public static final String SINGLE_RECORDERS_FIELD_NAME = "_RECORDERS";

    /**
     * 判断交易是否出错
     * 
     * @return
     */
    boolean hasError();

    /**
     * 报文字符集
     * 
     * @return
     */
    String getEncoding();

    /**
     * 设置报文字符集
     * 
     * @param string
     */
    void setEncoding(String encoding);

    //{{保留字段
    /**
     * 取应答码
     * 
     * @return
     */
    String getReturnCode();

    /**
     * 设置应答码
     */
    void setReturnCode(String code);

    /**
     * 取应答消息
     * 
     * @return
     */
    String getReturnMsg();

    /**
     * 设置应答信息
     * 
     * @param msg
     */
    void setReturnMsg(String msg);

    /**
     * 取处理码
     * 
     * @return
     */
    String getProcessCode();

    /**
     * 设置处理码
     * 
     * @param processCode
     */
    void setProcessCode(String processCode);

    /**
     * 会话ID
     * 用于标识客户端状态(如登录)
     * 客户端每次请求将提供此信息
     * 若客户未提供此信息，则由服务端产生新的ID，客户收到后保存至会话结束
     * 
     * @return
     */
    String getSessionId();

    void setSessionId(String id);

    /**
     * 令牌，交易识别码.
     * 在复杂通讯环境下用于跟踪交易,
     * 最初用户端每次请求产生一个新的唯一号码,
     * 由交易最初发起方提供的交易唯一编码,可以是GUID
     * 
     * @return
     */
    String getToken();

    void setToken(String token);

    /**
     * 翻页控制-每页大小.
     * @return
     */
    int getPageSize();

    void setPageSize(int pageSize);

    /**
     * 翻页控制-页码.
     * base 1
     * 
     * @return
     */
    int getPageNo();

    void setPageNo(int pageNo);

    /**
     * 翻页控制-总记录数.
     * 服务端可以提供的记录数总数，但每次仅返回其中一页数据.
     * @return
     */
    int getRecorderCount();

    void setRecorderCount(int count);

    //}}

    /**
     * 设置缺省的多记录包字段
     * 
     * @param recorders
     */
    void setRecorders(List<Map<String, Object>> recorders);

    /**
     * 取缺省的多记录包字段
     * 
     * @return
     */
    List<Map<String, Object>> getRecorders();

    /**
     * 清空数据报文
     */
    void clear();

    /**
     * 取出所有字段名
     * 
     * @return
     */
    Set<String> keySet();

    /**
     * 
     * @return
     */
    Collection<Object> values();

    /**
     * 取字段值
     * 
     * @param key
     * @return
     */
    Object get(String key);

    /**
     * 取出所有数据
     * 
     * @return
     */
    Map<String, Object> getAll();

    /**
     * 设字段值
     * 
     * @param key
     * @param value
     */
    void put(String key, Object value);

    /**
     * 将Map中的值设到数据包中
     * 其中"_RECORDERS"字段将作为多记录包
     * 
     * @param data
     */
    void putAll(Map<String, Object> data);

    /**
     * 从输入流读取.
     * 
     * @param in
     * @param pkglen 包长度
     * @return
     */
    DataMessage read(InputStream in, int pkglen);

    /**
     * 写入输出流.
     * 不包括包长度
     * 
     * @param out
     * @throws IOException
     * @throws UnsupportedEncodingException
     */
    void write(OutputStream out) throws UnsupportedEncodingException, IOException;

}
