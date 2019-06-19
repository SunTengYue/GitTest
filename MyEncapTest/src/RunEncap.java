
public class RunEncap {
	public static void main(String args[]) {
		EncapTest encap = new EncapTest();
		encap.setName("ËïÌÚÔ¾");
		encap.setAge(22);
		encap.setIdNum("007");
		
		System.out.print("Ãû×Ö£º"+encap.getName()+"\n"+
				"ÄêÁä£º"+encap.getAge()+"\n"+
				"±àºÅ£º"+encap.getIdNum());
	}
}
