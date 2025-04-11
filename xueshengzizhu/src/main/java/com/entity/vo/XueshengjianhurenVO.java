package com.entity.vo;

import com.entity.XueshengjianhurenEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 学生监护人
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xueshengjianhuren")
public class XueshengjianhurenVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 监护人名称
     */

    @TableField(value = "xueshengjianhuren_name")
    private String xueshengjianhurenName;


    /**
     * 监护人身份
     */

    @TableField(value = "xueshengjianhuren_types")
    private Integer xueshengjianhurenTypes;


    /**
     * 监护人工作
     */

    @TableField(value = "xueshengjianhuren_gongzuo")
    private String xueshengjianhurenGongzuo;


    /**
     * 监护人年龄
     */

    @TableField(value = "xueshengjianhuren_age")
    private Integer xueshengjianhurenAge;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：学生
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：监护人名称
	 */
    public String getXueshengjianhurenName() {
        return xueshengjianhurenName;
    }


    /**
	 * 获取：监护人名称
	 */

    public void setXueshengjianhurenName(String xueshengjianhurenName) {
        this.xueshengjianhurenName = xueshengjianhurenName;
    }
    /**
	 * 设置：监护人身份
	 */
    public Integer getXueshengjianhurenTypes() {
        return xueshengjianhurenTypes;
    }


    /**
	 * 获取：监护人身份
	 */

    public void setXueshengjianhurenTypes(Integer xueshengjianhurenTypes) {
        this.xueshengjianhurenTypes = xueshengjianhurenTypes;
    }
    /**
	 * 设置：监护人工作
	 */
    public String getXueshengjianhurenGongzuo() {
        return xueshengjianhurenGongzuo;
    }


    /**
	 * 获取：监护人工作
	 */

    public void setXueshengjianhurenGongzuo(String xueshengjianhurenGongzuo) {
        this.xueshengjianhurenGongzuo = xueshengjianhurenGongzuo;
    }
    /**
	 * 设置：监护人年龄
	 */
    public Integer getXueshengjianhurenAge() {
        return xueshengjianhurenAge;
    }


    /**
	 * 获取：监护人年龄
	 */

    public void setXueshengjianhurenAge(Integer xueshengjianhurenAge) {
        this.xueshengjianhurenAge = xueshengjianhurenAge;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
