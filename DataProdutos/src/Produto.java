import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Produto {
	
	private static final DateFormat df = DateFormat.getDateInstance();
	
	private String nome;
	private double peso;
	private Date dataValidade;
	
	public Produto(String nome, double peso, int dia, int mes, int ano){
		this.nome = nome;
		this.peso = peso;
		
		Calendar c = Calendar.getInstance();
		c.set(dia,  mes, ano);
		
		this.dataValidade = c.getTime();
	}
	
	public String getNome() {
		return nome;
	}
		
	public double getPeso() {
		return peso;
	}
		
	public Date getDataValidade() {
		return dataValidade;
	}
	
	public String getFormattedDataValidate(){
		return df.format(dataValidade);
	}
	
	public static String processar(String s){
		if (s == null) {
			return null;
		}
		s = s.toUpperCase();
		if (s.length() < 3) {
			return s;
		}
		
		String s2 = s.substring(0, 3);
		
		StringBuffer sb = new StringBuffer(s2);
		
		sb.reverse();
		
		return sb.toString() + " - " + s.substring(3);		
		
	}
	

}
