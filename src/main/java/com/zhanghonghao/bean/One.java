package com.zhanghonghao.bean;

public class One {

	private Integer oid;
	private String oname;
	private String daoyan;
	private Integer mach;
	private String odate;
	private Integer chang;
	private String leixing;
	private Integer niandai;
	private String quyu;
	
	private Integer tid;

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getDaoyan() {
		return daoyan;
	}

	public void setDaoyan(String daoyan) {
		this.daoyan = daoyan;
	}

	public Integer getMach() {
		return mach;
	}

	public void setMach(Integer mach) {
		this.mach = mach;
	}

	public String getOdate() {
		return odate;
	}

	public void setOdate(String odate) {
		this.odate = odate;
	}

	public Integer getChang() {
		return chang;
	}

	public void setChang(Integer chang) {
		this.chang = chang;
	}

	public String getLeixing() {
		return leixing;
	}

	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}

	public Integer getNiandai() {
		return niandai;
	}

	public void setNiandai(Integer niandai) {
		this.niandai = niandai;
	}

	public String getQuyu() {
		return quyu;
	}

	public void setQuyu(String quyu) {
		this.quyu = quyu;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public One(Integer oid, String oname, String daoyan, Integer mach, String odate, Integer chang, String leixing,
			Integer niandai, String quyu, Integer tid) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.daoyan = daoyan;
		this.mach = mach;
		this.odate = odate;
		this.chang = chang;
		this.leixing = leixing;
		this.niandai = niandai;
		this.quyu = quyu;
		this.tid = tid;
	}

	public One() {
		super();
	}

	@Override
	public String toString() {
		return "One [oid=" + oid + ", oname=" + oname + ", daoyan=" + daoyan + ", mach=" + mach + ", odate=" + odate
				+ ", chang=" + chang + ", leixing=" + leixing + ", niandai=" + niandai + ", quyu=" + quyu + ", tid="
				+ tid + "]";
	}
	
}
