import com.alunos.veiculos.entidade.carros.Carro;
import com.alunos.veiculos.entidade.carros.Moto;
import com.alunos.veiculos.entidade.carros.Veiculo;
import com.alunos.veiculos.entidade.entity.Motocros;
import com.alunos.veiculos.entidade.entity.Picape;
import com.alunos.veiculos.entidade.entity.Sendan;

public class aplicattion {

	public static void main(String[] args) {
		Veiculo veiculoCar = new Carro("012-121", "1212121212", "FIAT", 1.4, true);
		Veiculo veiculoMot = new Moto("012-323", "1212121212", "Honda",true, 1.5, true);
		
		Veiculo veiculoCar2 = new Picape("022-233","324343434", "Toyota", 3.0, true,"carroceira Aberta", 20.0 );
		Veiculo veiculoMot2 = new Motocros("023-232","34343434","SUSUZI", true, 3.0, true, "Suspesao ar", "Guindo aberto");
		
		
	}

}
