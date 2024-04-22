package java_encapsulation;

public class employee {
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEdsg() {
		return edsg;
	}
	public void setEdsg(String edsg) {
		this.edsg = edsg;
	}
	private int eid;
	private String ename;
	private int esal;
	private String edsg;
}
