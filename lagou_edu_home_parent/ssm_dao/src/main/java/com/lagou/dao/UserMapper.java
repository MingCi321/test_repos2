package com.lagou.dao;

import com.lagou.domain.User;
import com.lagou.domain.vo.UserVo;

import java.util.List;

public interface UserMapper {
    /*
查询所有用户
*/
    public List<User> findAllUserByPage(UserVo userVo);

    public List<User> findAllUserByPage3(UserVo userVo);
    public List<User> findAllUserByPage7(UserVo userVo);
    public List<User> findAllUserByPage8(UserVo userVo);
    public List<User> findAllUserByPage9(UserVo userVo);
    public List<User> findAllUserByPage5(UserVo userVo);
    public List<User> findAllUserByPage4(UserVo userVo);
    public List<User> findAllUserByPage6(UserVo userVo);


}
