package com.entity.model;

import com.entity.ZizhumingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 资助名单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZizhumingdanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 家庭
     */
    private Integer jiatingjingjiId;


    /**
     * 发放资金
     */
    private Double zizhumingdanMoney;


    /**
     * 资助详情
     */
    private String zizhumingdanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：家庭
	 */
    public Integer getJiatingjingjiId() {
        return jiatingjingjiId;
    }


    /**
	 * 设置：家庭
	 */
    public void setJiatingjingjiId(Integer jiatingjingjiId) {
        this.jiatingjingjiId = jiatingjingjiId;
    }
    /**
	 * 获取：发放资金
	 */
    public Double getZizhumingdanMoney() {
        return zizhumingdanMoney;
    }


    /**
	 * 设置：发放资金
	 */
    public void setZizhumingdanMoney(Double zizhumingdanMoney) {
        this.zizhumingdanMoney = zizhumingdanMoney;
    }
    /**
	 * 获取：资助详情
	 */
    public String getZizhumingdanContent() {
        return zizhumingdanContent;
    }


    /**
	 * 设置：资助详情
	 */
    public void setZizhumingdanContent(String zizhumingdanContent) {
        this.zizhumingdanContent = zizhumingdanContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
