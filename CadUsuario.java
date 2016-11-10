package webee.exemplo.acoes;

import java.util.LinkedList;

import org.ayty.webee.Acao;
import org.ayty.webee.MetodoHttp;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;

import webee.exemplo.GerenteUsuarios;
import webee.exemplo.Usuario;

public class CadUsuario extends Acao {

	@Override
	protected void executar(Requisicao req, Resposta resp) {

		
		GerenteUsuarios gerente = (GerenteUsuarios)this.getAplicacao().recuperarObjeto(GerenteUsuarios.KEY);
		LinkedList<Usuario> usuarios = gerente.getUsuarios();
		resp.adicionarDado("usuarios", usuarios);
		
		if (req.getMetodo().equals(MetodoHttp.POST)){
			String login = req.getParametro("login");
			String senha = req.getParametro("senha");
			String nome = req.getParametro("nome");
			if(gerente.existeUsuario(login)){
				resp.adicionarDado("erro", "Usuário existente!");
				resp.abrirPagina("/cadUsuario.jsp");
	
			}else{
				Usuario u = new Usuario(login,senha,nome);
			
				gerente.cadastrarUsuario(u);
				resp.abrirPagina("/cadOk.jsp");
		}
	}

}
}
