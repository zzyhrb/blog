package com.zzy.blog.pojo;

import java.util.Date;


public class User {

    private Long id;
    private String username;
    private String account;
    private String password;
    private Date createTime;
    private String headerPic;
    private Date updateTime;
    private Integer isDelete;
    private Integer age;
    private Integer male;
    private Integer active;
    private String sign;
    private String url;
    private Integer gcount;
    private Integer fans;
    private Integer type;//1 普通用户 2：会员  3：管理员
    private String idcard;
    private String salary;
    private String email;
    private Integer jifen;
    private Integer contribution;
    private Integer level;
    private Integer cron;
    private String address;
    private String job;
    private String intro;
    private String userdesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHeaderPic() {
        return headerPic;
    }

    public void setHeaderPic(String headerPic) {
        this.headerPic = headerPic;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMale() {
        return male;
    }

    public void setMale(Integer male) {
        this.male = male;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getGcount() {
        return gcount;
    }

    public void setGcount(Integer gcount) {
        this.gcount = gcount;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getJifen() {
        return jifen;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

    public Integer getContribution() {
        return contribution;
    }

    public void setContribution(Integer contribution) {
        this.contribution = contribution;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCron() {
        return cron;
    }

    public void setCron(Integer cron) {
        this.cron = cron;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getUserdesc() {
        return userdesc;
    }

    public void setUserdesc(String userdesc) {
        this.userdesc = userdesc;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", createTime=" + createTime +
                ", headerPic='" + headerPic + '\'' +
                ", updateTime=" + updateTime +
                ", isDelete=" + isDelete +
                ", age=" + age +
                ", male=" + male +
                ", active=" + active +
                ", sign='" + sign + '\'' +
                ", url='" + url + '\'' +
                ", gcount=" + gcount +
                ", fans=" + fans +
                ", type=" + type +
                ", idcard='" + idcard + '\'' +
                ", salary='" + salary + '\'' +
                ", email='" + email + '\'' +
                ", jifen=" + jifen +
                ", contribution=" + contribution +
                ", level=" + level +
                ", cron=" + cron +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", intro='" + intro + '\'' +
                ", userdesc='" + userdesc + '\'' +
                '}';
    }
}
