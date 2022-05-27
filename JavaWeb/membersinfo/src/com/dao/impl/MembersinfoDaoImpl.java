package com.dao.impl;

import java.util.List;

import com.dao.MembersinfoDao;
import com.entity.Membersinfo;

public class MembersinfoDaoImpl extends BaseDao implements MembersinfoDao {

	@Override
	public List<Membersinfo> queryList() {
		String sql = "SELECT id,mname,mgender,mage,maddress,memail FROM membersinfo ";
		List<Membersinfo> queryForList = queryForList(Membersinfo.class, sql);
		return queryForList;
	}

	@Override
	public Membersinfo queryUserById(int id) {
		String sql = "SELECT id,mname,mgender,mage,maddress,memail FROM membersinfo where id=?";
		return queryForOne(Membersinfo.class, sql, id);
	}

	@Override
	public int update(Membersinfo membersinfo) {
		String sql = "UPDATE membersinfo SET mname=?,mgender=?,maddress=?,memail=?,mage=? WHERE id=?;";
		return update(sql, membersinfo.getMname(), membersinfo.getMgender(),
				membersinfo.getMaddress(), membersinfo.getMemail(),membersinfo.getMage(),
				membersinfo.getId());
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM membersinfo WHERE id=?";
		return update(sql, id);

	}

}
