// in quick find method we create an array of size n where each array position give an id 
// now if two objectss are connected then id is same

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
		int i;
		if(id[p]==id[q])
			System.out.println("already connected");
		else
			{
				int temp = id[p];
				for(i=0;i<no;i++)
					if(id[i]==temp)
						id[i]=id[q];
			
			}
	}
	boolean connected(int p,int q){
		int i;
		if(id[p]==id[q])
			return true;
		else
			return false;
	}
	void print_id_array()
	{
		for(int i=0;i<no;i++)
			System.out.print(id[i] + "   ");
	}
}
public class Quick_find{
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