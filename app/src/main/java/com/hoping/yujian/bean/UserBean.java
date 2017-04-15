package com.hoping.yujian.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.Property;

/**
 * Created by ROG on 2017/4/15.
 */

@Entity(generateConstructors = false)
public class UserBean {
    @Id
    private Long id;
    @Property(nameInDb = "USERNAME")
    private String userName;

    @Keep
    public Long getId() {
        return id;
    }

    @Keep
    public void setId(Long id) {
        this.id = id;
    }

    @Keep
    public String getUserName() {
        return userName;
    }

    @Keep
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Keep
    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Keep
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserBean userBean = (UserBean) o;

        if (id != null ? !id.equals(userBean.id) : userBean.id != null) return false;
        return userName != null ? userName.equals(userBean.userName) : userBean.userName == null;

    }

    @Keep
    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
