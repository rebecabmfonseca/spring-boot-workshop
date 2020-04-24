package algaworksprojetoapi.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import algaworksprojetoapi.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Rebeca Bispo");
		cliente1.setEmail("rebecafonseca@dcc.ufrj.br");
		cliente1.setTelefone("21 975799533");
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("João Paulo");
		cliente2.setEmail("joaopaulobispo@gmail.com");
		cliente2.setTelefone("21 999999999");
		
		
		return Arrays.asList(cliente1,cliente2);
		
	}

}
