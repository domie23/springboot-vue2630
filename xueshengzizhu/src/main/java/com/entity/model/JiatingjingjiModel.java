package com.entity.model;

import com.entity.JiatingjingjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 家庭经济信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiatingjingjiModel implements Serializable {
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
     * 家庭住址
     */
    private String jiatingjingjiName;


    /**
     * 家庭收入
     */
    private Double jiatingjingjiMoney;


    /**
     * 证明文件
     */
    private String jiatingjingjiFile;


    /**
     * 家庭类型
     */
    private Integer jiatingjingjiTypes;


    /**
     * 详情
     */
    private String jiatingjingjiContent;


    /**
     * 审核状态
     */
    private Integer jiatingjingjiYesnoTypes;


    /**
     * 审核结果
     */
    private String jiatingjingjiYesnoText;


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
	 * 获取：家庭住址
	 */
    public String getJiatingjingjiName() {
        return jiatingjingjiName;
    }


    /**
	 * 设置：家庭住址
	 */
    public void setJiatingjingjiName(String jiatingjingjiName) {
        this.jiatingjingjiName = jiatingjingjiName;
    }
    /**
	 * 获取：家庭收入
	 */
    public Double getJiatingjingjiMoney() {
        return jiatingjingjiMoney;
    }


    /**
	 * 设置：家庭收入
	 */
    public void setJiatingjingjiMoney(Double jiatingjingjiMoney) {
        this.jiatingjingjiMoney = jiatingjingjiMoney;
    }
    /**
	 * 获取：证明文件
	 */
    public String getJiatingjingjiFile() {
        return jiatingjingjiFile;
    }


    /**
	 * 设置：证明文件
	 */
    public void setJiatingjingjiFile(String jiatingjingjiFile) {
        this.jiatingjingjiFile = jiatingjingjiFile;
    }
    /**
	 * 获取：家庭类型
	 */
    public Integer getJiatingjingjiTypes() {
        return jiatingjingjiTypes;
    }


    /**
	 * 设置：家庭类型
	 */
    public void setJiatingjingjiTypes(Integer jiatingjingjiTypes) {
        this.jiatingjingjiTypes = jiatingjingjiTypes;
    }
    /**
	 * 获取：详情
	 */
    public String getJiatingjingjiContent() {
        return jiatingjingjiContent;
    }


    /**
	 * 设置：详情
	 */
    public void setJiatingjingjiContent(String jiatingjingjiContent) {
        this.jiatingjingjiContent = jiatingjingjiContent;
    }
    /**
	 * 获取：审核状态
	 */
    public Integer getJiatingjingjiYesnoTypes() {
        return jiatingjingjiYesnoTypes;
    }


    /**
	 * 设置：审核状态
	 */
    public void setJiatingjingjiYesnoTypes(Integer jiatingjingjiYesnoTypes) {
        this.jiatingjingjiYesnoTypes = jiatingjingjiYesnoTypes;
    }
    /**
	 * 获取：审核结果
	 */
    public String getJiatingjingjiYesnoText() {
        return jiatingjingjiYesnoText;
    }


    /**
	 * 设置：审核结果
	 */
    public void setJiatingjingjiYesnoText(String jiatingjingjiYesnoText) {
        this.jiatingjingjiYesnoText = jiatingjingjiYesnoText;
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
