package webee.exemplo.acoes;

import java.util.LinkedList;

import org.ayty.webee.Acao;
import org.ayty.webee.MetodoHttp;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;

import webee.exemplo.GerenteUsuarios;
import webee.exemplo.Usuario;

public class EditarUsuarioo extends Acao{
		protected void executar(Requisicao req, Resposta resp) {

			
			GerenteUsuarios gerente = (GerenteUsuarios)this.getAplicacao().recuperarObjeto(GerenteUsuarios.KEY);
			LinkedList<Usuario> usuarios = gerente.getUsuarios();
			resp.adicionarDado("usuarios", usuarios);
			
			if (req.getMetodo().equals(MetodoHttp.POST)){
				String login = req.getParametro("login");
				String nLogin = req.getParametro("nlogin");
				String nSenha = req.getParametro("nsenha");
				String nNome = req.getParametro("nnome");
				if(!gerente.existeUsuario(login)){
					resp.adicionarDado("erro", "Usuário inexistente!");
					resp.abrirPagina("/editarUsuario.jsp");
		
				}else{
					gerente.editarUsuario(login, nLogin, nSenha, nNome);
					resp.abrirPagina("/cadUsuario.jsp");
			}
			}
		}
	}

