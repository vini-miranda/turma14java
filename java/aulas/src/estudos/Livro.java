package estudos;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPags;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPags() {
		return totPags;
	}
	public void setTotPags(int totPags) {
		this.totPags = totPags;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	public Livro(String titulo, String autor, int totPags, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPags = totPags;
		this.leitor = leitor;
	}
	

	public String detalhes() {
		return "Livro: " + this.titulo + "\nAutor: " + this.autor + "\nTotal de páginas: " + this.totPags + "\nAberto: " + this.aberto + "\nLeitor: " + this.leitor.getNome();
	}
	@Override
	public void abrir() {
		this.aberto = true;
	}
	@Override
	public void fechar() {
		this.aberto = false;
	}
	@Override
	public void folhear(int p) {
		this.pagAtual = p;
	}
	@Override
	public void avancarPag() {
		this.pagAtual++;
	}
	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
}
