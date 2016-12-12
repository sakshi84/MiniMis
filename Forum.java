package bean;

public class Forum {
	
	public int TAns,Queid,Ansid;
	public String Que[], Ans[][], Memberid;
	public Forum(){
		Que= new String[10];
		Ans=new String[10][10];
	}

	public int getQueid() {
		return Queid;
	}
	
	public void setQueid(int Q) {
		this.Queid = Q;
	}
	
	public int getAnsid() {
		return Queid;
	}
	
	public void setAnsid(int A) {
		this.Ansid=A;
	}

	public String getMemberid() {
		return Memberid;
	}

	public void setMemberid(String M) {
		this.Memberid = M;
	}

	public String getQue(int Q) {
		//System.out.println("get"+Que[Q]);
		return Que[Q];
	}

	public void setQue(int Q,String Qu) {
		System.out.println(Qu);
		this.Que[Q]=Qu;
	}

	public String getAns(int A) {
		return Ans[Queid][A];
	}

	public void setAns(int A,String An) {
		this.Ans[Queid][A]=An;
	}
	 public void setTAns(int i){
		 TAns=i;
	 }
	 
	 public int getTAns(){
		 return TAns;
	 }
	/*
	public static void main(String args[]){
		Forum f=new Forum();
		ForumDao fd=new ForumDao();
		fd.Fetch_from_database(f,1,1); 
		System.out.println(f.getQue(1));
		System.out.println(f.getAns(1));
	}*/
}