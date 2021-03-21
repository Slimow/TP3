
public class Lista_de_compras {
private String lugarCompras;


public Lista_de_compras(String lc) {
	lugarCompras = lc;
	
	
}
public class local {
	public String mercado;
	public String acougue;
	public String feira;
	public String emporio;
	
	public Local(String m, String a, String f, String e) {
		mercado = m;
		acougue = a;
		feira = f;
		emporio = e;
	}
}
public void escolher () {
	
}


public String getLugarCompras() {
	return lugarCompras;
}


public void setLugarCompras(String lugarCompras) {
	this.lugarCompras = lugarCompras;
}

}
