
public class RunEncap {
	public static void main(String args[]) {
		EncapTest encap = new EncapTest();
		encap.setName("����Ծ");
		encap.setAge(22);
		encap.setIdNum("007");
		
		System.out.print("���֣�"+encap.getName()+"\n"+
				"���䣺"+encap.getAge()+"\n"+
				"��ţ�"+encap.getIdNum());
	}
}
