package it.trionica.web.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ComponentSystemEvent;

import it.trionica.web.util.Util;
import lombok.extern.log4j.Log4j2;

@ManagedBean(name="userController")
@ViewScoped
@Log4j2
public class UserController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String nomeUtente;
	
	
	@ManagedProperty(value="#{util}")
	private Util util;
	
	@PostConstruct
	public void init() throws Exception{
		
		log.debug("UserController init");	
	}
	
	public void onLoadView(ComponentSystemEvent event) {
	
		log.debug("sono in onloadView");
		setNomeUtente("Angelo");
	}

	public String getNomeUtente() {
		return nomeUtente;
	}

	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}

	public Util getUtil() {
		return util;
	}

	public void setUtil(Util util) {
		this.util = util;
	}
	

}
