package com.service;

import com.entity.Membersinfo;

import java.util.List;

public interface MembersinfoService {
    /**
     * 查询所有会员信息
     * @return 如果返回null,说明没有用户。反之亦然
     */
    public List<Membersinfo> queryList();

    /**
     * 根据会员编号查询用户信息
     * @param id 用户名
     * @return 如果返回null,说明没有这个用户。反之亦然
     */
    public Membersinfo queryUserById(int id);

    /**
     * 修改指定会员的信息
     * @param membersinfo
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    public int update(Membersinfo membersinfo);

    /**
     * 删除指定会员的信息
     * @param id
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    public int deleteMembersinfoById(Integer id);
}
