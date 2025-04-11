package com.entity.model;

import com.entity.XueshengjianhurenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 学生监护人
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengjianhurenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 监护人名称
     */
    private String xueshengjianhurenName;


    /**
     * 监护人身份
     */
    private Integer xueshengjianhurenTypes;


    /**
     * 监护人工作
     */
    private String xueshengjianhurenGongzuo;


    /**
     * 监护人年龄
     */
    private Integer xueshengjianhurenAge;


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
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：监护人名称
	 */
    public String getXueshengjianhurenName() {
        return xueshengjianhurenName;
    }


    /**
	 * 设置：监护人名称
	 */
    public void setXueshengjianhurenName(String xueshengjianhurenName) {
        this.xueshengjianhurenName = xueshengjianhurenName;
    }
    /**
	 * 获取：监护人身份
	 */
    public Integer getXueshengjianhurenTypes() {
        return xueshengjianhurenTypes;
    }


    /**
	 * 设置：监护人身份
	 */
    public void setXueshengjianhurenTypes(Integer xueshengjianhurenTypes) {
        this.xueshengjianhurenTypes = xueshengjianhurenTypes;
    }
    /**
	 * 获取：监护人工作
	 */
    public String getXueshengjianhurenGongzuo() {
        return xueshengjianhurenGongzuo;
    }


    /**
	 * 设置：监护人工作
	 */
    public void setXueshengjianhurenGongzuo(String xueshengjianhurenGongzuo) {
        this.xueshengjianhurenGongzuo = xueshengjianhurenGongzuo;
    }
    /**
	 * 获取：监护人年龄
	 */
    public Integer getXueshengjianhurenAge() {
        return xueshengjianhurenAge;
    }


    /**
	 * 设置：监护人年龄
	 */
    public void setXueshengjianhurenAge(Integer xueshengjianhurenAge) {
        this.xueshengjianhurenAge = xueshengjianhurenAge;
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
