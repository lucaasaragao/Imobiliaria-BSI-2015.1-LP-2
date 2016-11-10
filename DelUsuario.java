package webee.exemplo.acoes;

import java.util.LinkedList;

import org.ayty.webee.Acao;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;

import webee.exemplo.GerenteUsuarios;
import webee.exemplo.Usuario;

public class DelUsuario extends Acao{
	
protected void executar(Requisicao req, Resposta resp) {

		GerenteUsuarios gerente = (GerenteUsuarios)this.getAplicacao().recuperarObjeto(GerenteUsuarios.KEY);
		String login = req.getParametro("login");
		gerente.removerUsuario(login);
		LinkedList<Usuario> usuarios = gerente.getUsuarios();
		resp.adicionarDado("usuarios", usuarios);
		resp.abrirPagina("/cadUsuario.jsp");
		}
	}
