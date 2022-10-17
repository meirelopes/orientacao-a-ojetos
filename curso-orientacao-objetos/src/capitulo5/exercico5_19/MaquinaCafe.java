package capitulo5.exercico5_19;

public class MaquinaCafe {
	
	private int acucarDisponivel;

	public int getAcucarDisponivel() {
		return acucarDisponivel;
	}

	public void setAcucarDisponivel(int acucarDisponivel) {
		this.acucarDisponivel = acucarDisponivel;
	}
	
	public void fazerCafe(int quantidadeAcucar) {
		if(acucarDisponivel>=quantidadeAcucar) {
			System.out.println("Fazendo café com "+quantidadeAcucar+" de açúcar.");
			acucarDisponivel=acucarDisponivel-quantidadeAcucar;
		} else {
			System.out.println("Sinto muito. Não há acúcar disponível na máquina.");
		}	
	}
	int qtidadePadrãoAcucar = 10;
	public void fazerCafe() {
		fazerCafe(qtidadePadrãoAcucar);

	}

}
