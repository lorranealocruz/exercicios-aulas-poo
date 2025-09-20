package aula08_oficina;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Carro extends Veiculo{

	public Carro(String modelo, String placa, Proprietario proprietario) {
		super(modelo, placa, proprietario);
		
	}

	@Override
	public void trocarOleo() {
		LocalDate hoje = LocalDate.now();
        if (hoje.getDayOfWeek() == DayOfWeek.SATURDAY) {
            valorCobrado += TipoServico.TROCA_OLEO.getValor() - 50;
        } else {
            valorCobrado += TipoServico.TROCA_OLEO.getValor();
        }
    }

	@Override
	public void revisao() {
		LocalDate hoje = LocalDate.now();
        if (hoje.getMonth() == Month.AUGUST) {
            valorCobrado += TipoServico.REVISAO.getValor() * 0.9;
        } else {
            valorCobrado += TipoServico.REVISAO.getValor();
        }
    }

	@Override
	public void lavarVeiculo() {
		valorCobrado += TipoServico.LAVAR.getValor();
		
	}


}
