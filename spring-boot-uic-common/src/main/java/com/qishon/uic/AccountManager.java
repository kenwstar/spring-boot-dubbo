package com.qishon.uic;

/**
 * Created by kenwstar on 2016/12/28.
 */
public interface AccountManager {

    public User findById(Long id);

    public void create(User user);
}
