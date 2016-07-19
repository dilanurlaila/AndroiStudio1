class BelajarVariable {
		
		String VariableA = "This is instance variable yang berada di dalam class"; // harus create objek nya dulu baru bisa di akses
		static String VarC = "this is static variable, yang tidak berada didalam method/constutor/block"; // static bisa di akses menggunakan object/secara langsung dari kelasnya
		
		public String VarB(){
		String VarB = "this is variable local yang berada didalam method";
		
		}
		public static void main (String [] args) {
		
		BelajarVariable bv = new BelajarVariable();
		bv.VariableA = "begini caranya memanggil instance variable";
		System.out.println(bv.VariableA);
		
		System.out.println(BelajarVariable.VarC);
		bv.VarC = "hai aku static variable";
		
		System.out.println (bv.VarB());
		
		
		
		}
}
		
		
		
		