//improvement of previous version of quick union
// my way of finding the height 
//has optimized quick union
//will maintain an extra array sz[] to keep ht of each object 
class UF{
	int no;
	int[] id,sz;
	int cnt;
	UF(int N){
	 no = N;
	 id = new int[N];
	 sz = new int[N];
	 for(int i=0;i<no;i++)
		id[i]=i;
		sz[i]=1;
	}
	void union(int p,int q)
	{
		int j,i;
		i=root(p);
		int h1=cnt;
		j=root(q);
		int h2=cnt;
		if(i==j)
			System.out.println("already conn");
		
		else if(sz[i]>sz[j])
			{id[j]=i; sz[i] + = sz[j]}
		else
			{id[i]=j;sz[j] + = sz[i]}
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
		cnt=0;
		while(id[p]!=p)
			{p=id[p];cnt++;}
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