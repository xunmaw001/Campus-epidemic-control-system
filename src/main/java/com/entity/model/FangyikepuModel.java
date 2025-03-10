package com.entity.model;

import com.entity.FangyikepuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 防疫科普
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangyikepuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String fangyikepuName;


    /**
     * 图片
     */
    private String fangyikepuPhoto;


    /**
     * 相关文件
     */
    private String fangyikepuFile;


    /**
     * 内容
     */
    private String fangyikepuContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：标题
	 */
    public String getFangyikepuName() {
        return fangyikepuName;
    }


    /**
	 * 设置：标题
	 */
    public void setFangyikepuName(String fangyikepuName) {
        this.fangyikepuName = fangyikepuName;
    }
    /**
	 * 获取：图片
	 */
    public String getFangyikepuPhoto() {
        return fangyikepuPhoto;
    }


    /**
	 * 设置：图片
	 */
    public void setFangyikepuPhoto(String fangyikepuPhoto) {
        this.fangyikepuPhoto = fangyikepuPhoto;
    }
    /**
	 * 获取：相关文件
	 */
    public String getFangyikepuFile() {
        return fangyikepuFile;
    }


    /**
	 * 设置：相关文件
	 */
    public void setFangyikepuFile(String fangyikepuFile) {
        this.fangyikepuFile = fangyikepuFile;
    }
    /**
	 * 获取：内容
	 */
    public String getFangyikepuContent() {
        return fangyikepuContent;
    }


    /**
	 * 设置：内容
	 */
    public void setFangyikepuContent(String fangyikepuContent) {
        this.fangyikepuContent = fangyikepuContent;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
