package webee.exemplo.acoes;

import java.util.LinkedList;

import org.ayty.webee.Acao;
import org.ayty.webee.MetodoHttp;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;

import webee.exemplo.GerenteUsuarios;
import webee.exemplo.Usuario;

public class EditarUsuario extends Acao{
		protected void executar(Requisicao req, Resposta resp) {

			
			GerenteUsuarios gerente = (GerenteUsuarios)this.getAplicacao().recuperarObjeto(GerenteUsuarios.KEY);
			LinkedList<Usuario> usuarios = gerente.getUsuarios();

			if (req.getMetodo().equals(MetodoHttp.POST)){
				String login = req.getParametro("login");

				if(!gerente.existeUsuario(login)){
					resp.adicionarDado("erro", "Usuário inexistente!");
					resp.abrirPagina("/editarUsuario.jsp");
		
				}else{
					resp.adicionarDado("usuario", gerente.getUsuario(login));
					resp.abrirPagina("/editarUsuarioo.jsp");
			}
			}
		}
	}

