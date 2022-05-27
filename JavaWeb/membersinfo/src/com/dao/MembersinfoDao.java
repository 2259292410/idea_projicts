package com.dao;

import java.util.List;

import com.entity.Membersinfo;

public  interface MembersinfoDao {
	/**
     * ��ѯ���л�Ա��Ϣ
     * @return �������null,˵��û���û�����֮��Ȼ
     */
	public List<Membersinfo> queryList();
	
	/**
     * ���ݻ�Ա��Ų�ѯ�û���Ϣ
     * @param id �û���
     * @return �������null,˵��û������û�����֮��Ȼ
     */
    public Membersinfo queryUserById(int id);
	
    /**
     * �޸�ָ����Ա����Ϣ
     * @param user
     * @return ����-1��ʾ����ʧ�ܣ�������sql���Ӱ�������
     */
	public int update(Membersinfo membersinfo);
	
	 /**
     * ɾ��ָ����Ա����Ϣ
     * @param user
     * @return ����-1��ʾ����ʧ�ܣ�������sql���Ӱ�������
     */
	public int delete(Integer id);
}
