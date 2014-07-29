
//union is worse than find thats wat i thing
class UF{
	int no;
	int[] id;
	UF(int N){
	 no = N;
	 id = new int[N];
	 for(int i=0;i<no;i++)
		id[i]=i;
	}
	void union(int p,int q)
	{
		int j,i;
		i=root(p);
		j=root(q);
		if(i==j)
			System.out.println("already conn");
		
		else
			id[j]=i;
	}
	boolean connected(int p,int q){
		int i,j;
		i=root(p);
		j=root(q);
		if(i==j)
			return true;
		return false;
		
	}
	int root(int p)
	{
		while(id[p]!=p)
			p=id[p];
		return p;	
	}
	void print_id_array()
	{
		for(int i=0;i<no;i++)
			System.out.print(id[i] + "   ");
	}
}
public class Quick_union{
	public static void main(String args[])
	{
		
		
		System.out.print("Enter no. of object :");
		int n = StdIn.readInt();
		UF uf = new UF(n);
		
		while (!StdIn.isEmpty())
		{
			System.out.print("Enter two obj for uniion:");
			int p=StdIn.readInt();
			int q=StdIn.readInt();
			//probl;em in isempty so to break from loop enter any invaliud no.
			if(p>=uf.no||p<0)
				break;
			uf.union(p,q);
			uf.print_id_array();
			
		}
		
		System.out.println("Enter obj to chekc for conn. :");
		int p=StdIn.readInt();
		int q=StdIn.readInt();
		System.out.println("Connection  is " + uf.connected(p,q));
		
		
	}
}