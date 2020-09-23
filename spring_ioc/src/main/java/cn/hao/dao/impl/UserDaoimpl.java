package cn.hao.dao.impl;

import cn.hao.dao.UserDao;

public class UserDaoimpl implements UserDao {
    public UserDaoimpl() {
        System.out.println("userDaoimpl创建");
    }

    public void save() {
        System.out.println("save running");
    }
}
